package com.lyra.lyraimsystem.domain.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "friendship")
@IdClass(FriendshipPrk.class)
public class Friendship {
    @Schema(description = "应用id")
    @Id
    private Long appId;
    @Schema(description = "关注用户id")
    @Id
    private Long fromId;
    @Schema(description = "被关注用户id")
    @Id
    private Long toId;

    @Schema(description = "备注")
    private String  remark;

    @Schema(description = "状态 1正常 2删除 0未添加")
    private Short status;

    @Schema(description = "拉黑 1正常 2拉黑")
    private Short black;

    @Schema(description = "seq")
    private String blackSequence;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "seq")
    private Long friendSequence;

    @Schema(description = "来源")
    private String addSource;

    @Schema(description = "扩展")
    private String extra;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getBlack() {
        return black;
    }

    public void setBlack(Short black) {
        this.black = black;
    }

    public String getBlackSequence() {
        return blackSequence;
    }

    public void setBlackSequence(String blackSequence) {
        this.blackSequence = blackSequence;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getFriendSequence() {
        return friendSequence;
    }

    public void setFriendSequence(Long friendSequence) {
        this.friendSequence = friendSequence;
    }

    public String getAddSource() {
        return addSource;
    }

    public void setAddSource(String addSource) {
        this.addSource = addSource;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
