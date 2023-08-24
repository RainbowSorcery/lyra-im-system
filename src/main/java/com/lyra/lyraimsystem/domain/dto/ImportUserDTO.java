package com.lyra.lyraimsystem.domain.dto;

import com.lyra.lyraimsystem.domain.entity.UserData;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

/**
 * 导入用户dto
 */
public class ImportUserDTO extends BaseDTO {
    @Schema(description = "用户信息")
    private List<UserData> userDataList;

    public List<UserData> getUserDataList() {
        return userDataList;
    }

    public void setUserDataList(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }
}
