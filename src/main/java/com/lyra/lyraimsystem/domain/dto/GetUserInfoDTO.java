package com.lyra.lyraimsystem.domain.dto;


import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public class GetUserInfoDTO extends BaseDTO {
    @Schema(description = "用户id")
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "GetUserInfoDTO{" +
                "userId=" + userId +
                '}';
    }
}
