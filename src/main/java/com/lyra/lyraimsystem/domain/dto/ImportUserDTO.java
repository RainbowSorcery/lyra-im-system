package com.lyra.lyraimsystem.domain.dto;

import com.lyra.lyraimsystem.domain.entity.UserData;

import java.util.List;

public class ImportUserDTO extends BaseDTO {
    private List<UserData> userDataList;

    public List<UserData> getUserDataList() {
        return userDataList;
    }

    public void setUserDataList(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }
}
