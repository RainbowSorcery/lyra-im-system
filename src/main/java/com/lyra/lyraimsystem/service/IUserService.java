package com.lyra.lyraimsystem.service;

import com.lyra.lyraimsystem.common.Result;
import com.lyra.lyraimsystem.domain.dto.ImportUserDTO;

public interface IUserService {
    Result<Object> importUser(ImportUserDTO importUserDTOList);
}
