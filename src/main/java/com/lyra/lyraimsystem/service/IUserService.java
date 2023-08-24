package com.lyra.lyraimsystem.service;

import com.lyra.lyraimsystem.common.Result;
import com.lyra.lyraimsystem.domain.dto.GetUserInfoDTO;
import com.lyra.lyraimsystem.domain.dto.ImportUserDTO;
import com.lyra.lyraimsystem.domain.entity.UserData;

import java.util.List;

public interface IUserService {
    Result<Object> importUser(ImportUserDTO importUserDTOList);

    Result<List<UserData>> getUserInfo(List<GetUserInfoDTO> getUserInfoDTOList);
}
