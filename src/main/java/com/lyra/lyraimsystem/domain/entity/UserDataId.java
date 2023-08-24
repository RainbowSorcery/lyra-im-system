package com.lyra.lyraimsystem.domain.entity;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * 用户信息主键
 */
public class UserDataId implements Serializable {
    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "应用id")
    private Long appId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }
}
