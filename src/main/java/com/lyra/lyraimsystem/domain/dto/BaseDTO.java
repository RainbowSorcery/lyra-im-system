package com.lyra.lyraimsystem.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class BaseDTO {
    @Schema(description = "应用id")
    private Long appId;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }
}
