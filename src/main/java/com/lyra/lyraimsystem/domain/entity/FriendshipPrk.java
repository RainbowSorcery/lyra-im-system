package com.lyra.lyraimsystem.domain.entity;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * 好友关系
 */
public class FriendshipPrk implements Serializable {
    @Schema(description = "应用id")
    private Long appId;
    @Schema(description = "关注用户id")
    private Long fromId;
    @Schema(description = "被关注用户id")
    private Long toId;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }
}
