package com.lyra.lyraimsystem.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class DeleteUserDTO {
    @Schema(description = "应用id")
    private Long appId;
    @Schema(description = "用户id")
    private Long userId;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
