package com.lyra.lyraimsystem.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lyra.lyraimsystem.config.IdGeneratorConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

/**
 * 用户数据
 */
@Entity
@Table(name = "user_data")
@IdClass(UserDataId.class)
public class UserData {

    @Schema(description = "用户id")
    @Id
    @GeneratedValue(generator = "id-generator-config")
    @GenericGenerator(name = "id-generator-config", type = IdGeneratorConfig.class)
    private Long userId;

    @Schema(description = "应用id")
    @Id
    private Long appId;


    @Schema(description = "昵称")
    private String nickName;

    @Schema(description = "性别 1男 2女 0未设置/未知")
    private Short userSex;

    @Schema(description = "生日")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDate birthday;

    @Schema(description = "所在地")
    private String location;

    @Schema(description = "个性签名")
    private String selfSignature;

    @Schema(description = "添加好友方式 1无需验证 2需要验证")
    private Short friendAllowType;

    @Schema(description = "头像地址")
    private String photo;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "管理员禁止用户添加好友: 0未禁用 1已禁用")
    private Short disableAddFriend;

    @Schema(description = "禁言标识 1禁言 0未禁言")
    private Short silentFlag;

    @Schema(description = "禁用标识 1禁用 0未禁用")
    private Short forbiddenFlag;

    @Schema(description = "用户类型 0 im用户 1 admin")
    private Short userType;

    @Schema(description = "删除标识 0未删除 1删除")
    private Short delFlag;

    @Schema(description = "删除标识 0未删除 1删除")
    private String extra;



    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Short getUserSex() {
        return userSex;
    }

    public void setUserSex(Short userSex) {
        this.userSex = userSex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSelfSignature() {
        return selfSignature;
    }

    public void setSelfSignature(String selfSignature) {
        this.selfSignature = selfSignature;
    }



    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getDisableAddFriend() {
        return disableAddFriend;
    }

    public void setDisableAddFriend(Short disableAddFriend) {
        this.disableAddFriend = disableAddFriend;
    }

    public Short getSilentFlag() {
        return silentFlag;
    }

    public void setSilentFlag(Short silentFlag) {
        this.silentFlag = silentFlag;
    }

    public Short getForbiddenFlag() {
        return forbiddenFlag;
    }

    public void setForbiddenFlag(Short forbiddenFlag) {
        this.forbiddenFlag = forbiddenFlag;
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Short getFriendAllowType() {
        return friendAllowType;
    }

    public void setFriendAllowType(Short friendAllowType) {
        this.friendAllowType = friendAllowType;
    }

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
