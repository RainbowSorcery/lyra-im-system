package com.lyra.lyraimsystem.common;


import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 逻辑删除标志位
 */
public enum DeleteFlagEnums {
    YES((short) 1, "是"),
    NO((short) 0, "否");

    @Schema(description = "状态码")
    private Short status;
    @Schema(description = "消息")
    private String message;


    public Short getStatus() {

        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    DeleteFlagEnums(Short status, String message) {
        this.status = status;
        this.message = message;
    }
}
