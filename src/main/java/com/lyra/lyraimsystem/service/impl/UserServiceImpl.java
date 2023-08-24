package com.lyra.lyraimsystem.service.impl;

import com.lyra.lyraimsystem.Repository.UserDataRepository;
import com.lyra.lyraimsystem.common.ResponseEnums;
import com.lyra.lyraimsystem.common.Result;
import com.lyra.lyraimsystem.domain.dto.GetUserInfoDTO;
import com.lyra.lyraimsystem.domain.dto.ImportUserDTO;
import com.lyra.lyraimsystem.domain.entity.UserData;
import com.lyra.lyraimsystem.exception.LyraImException;
import com.lyra.lyraimsystem.service.IUserService;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

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

    @Override
    public Result<List<UserData>> getUserInfo(List<GetUserInfoDTO> getUserInfoDTOList) {
        List<UserData> userDataList = new ArrayList<>();

        for (GetUserInfoDTO getUserInfoDTO : getUserInfoDTOList) {
            UserData userData = userDataRepository.findByUserIdAndAppId(getUserInfoDTO.getUserId(), getUserInfoDTO.getAppId());

            if (userData == null) {
                log.info("用户不存在：{}", getUserInfoDTO);
                throw new LyraImException(ResponseEnums.USER_NOT_FOUND, getUserInfoDTO);
            }

            userDataList.add(userData);
        }

        return Result.ok(userDataList);
    }


}
