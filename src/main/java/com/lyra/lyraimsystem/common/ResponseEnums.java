package com.lyra.lyraimsystem.common;

public enum ResponseEnums {
    SUCCESSFUL(200, true, "成功"),
    FAILED(500, false, "失败"),
    APPID_IS_NULL(501, false, "APPID为空"),
    USER_NOT_FOUND(502, false, "用户不存在"),
    PARAM_IS_NULL(504, false, "参数为空"),
    ;
    private Integer code;

    private Boolean successful;

    private String message;

    ResponseEnums(Integer code, Boolean successful, String message) {
        this.code = code;
        this.successful = successful;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccessful() {
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
