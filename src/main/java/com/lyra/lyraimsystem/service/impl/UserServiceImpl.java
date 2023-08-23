package com.lyra.lyraimsystem.service.impl;

import com.lyra.lyraimsystem.Repository.UserDataRepository;
import com.lyra.lyraimsystem.common.Result;
import com.lyra.lyraimsystem.domain.dto.ImportUserDTO;
import com.lyra.lyraimsystem.domain.entity.UserData;
import com.lyra.lyraimsystem.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    @Transactional
    public Result<Object> importUser(ImportUserDTO importUserDTO) {
        List<UserData> userDataList = importUserDTO
                .getUserDataList()
                .stream().peek(e -> {
                    e.setAppId(importUserDTO.getAppId());
                })
                .collect(Collectors.toList());

        userDataRepository.saveAll(userDataList);

        return Result.ok();
    }
}
