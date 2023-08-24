package com.lyra.lyraimsystem.common;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 响应内容
 *
 * @param <T> data泛型
 */
public class Result<T> {
    @Schema(description = "code")
    private Integer code;
    @Schema(description = "返回信息")
    private String message;

    @Schema(description = "是否成功")
    private Boolean successful;

    @Schema(description = "响应内容")
    private T data;

    public Result(Integer code, String message, Boolean successful, T data) {
        this.code = code;
        this.message = message;
        this.successful = successful;
        this.data = data;
    }

    public Result(Integer code, String message, Boolean successful) {
        this.code = code;
        this.message = message;
        this.successful = successful;
    }

    public Result(ResponseEnums responseEnums) {
        this.code = responseEnums.getCode();
        this.message = responseEnums.getMessage();
        this.successful = responseEnums.getSuccessful();
    }

    public Result(ResponseEnums responseEnums, T data) {
        this.code = responseEnums.getCode();
        this.message = responseEnums.getMessage();
        this.successful = responseEnums.getSuccessful();
        this.data = data;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccessful() {
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public static <T> Result<T> ok(T data) {
        return new Result<>(ResponseEnums.SUCCESSFUL, data);
    }

    public static <T> Result<T> ok() {
        return new Result<>(ResponseEnums.SUCCESSFUL);
    }

    public static <T> Result<T> filed(T data) {
        return new Result<>(ResponseEnums.FAILED, data);
    }

    public static <Object> Result<Object> filed() {
        return new Result<>(ResponseEnums.FAILED);
    }


    public static <Object> Result<Object> filed(ResponseEnums responseEnums, Object data) {
        return new Result<>(responseEnums, data);
    }

    public static <Object> Result<Object> filed(ResponseEnums responseEnums) {
        return new Result<>(responseEnums);
    }
}
