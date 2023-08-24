package com.lyra.lyraimsystem.controller;

import com.lyra.lyraimsystem.common.ResponseEnums;
import com.lyra.lyraimsystem.common.Result;
import com.lyra.lyraimsystem.domain.dto.GetUserInfoDTO;
import com.lyra.lyraimsystem.domain.dto.ImportUserDTO;
import com.lyra.lyraimsystem.domain.entity.UserData;
import com.lyra.lyraimsystem.service.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/user")
@Tag(name = "用户管理")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/importUser")
    @Operation(summary = "导入用户")
    public Result<Object> importUser(@RequestBody ImportUserDTO importUserDTO) {
        if (importUserDTO.getAppId() == null) {
            return new Result<>(ResponseEnums.APPID_IS_NULL);
        }

        return userService.importUser(importUserDTO);
    }

    @PostMapping("/getUserInfo")
    @Operation(summary = "获取用户信息")
    public Result<List<UserData>> getUserInfo(@RequestBody List<GetUserInfoDTO> getUserInfoDTOList) {

        return userService.getUserInfo(getUserInfoDTOList);
    }
}
