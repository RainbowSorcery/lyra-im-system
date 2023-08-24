package com.lyra.lyraimsystem.exception;

import com.lyra.lyraimsystem.common.ResponseEnums;

/**
 * 自定义异常类
 */
public class LyraImException extends RuntimeException {
    private ResponseEnums responseEnums;
    private Object data;

    public LyraImException(ResponseEnums responseEnums, Object data) {
        this.responseEnums = responseEnums;
        this.data = data;
    }

    public LyraImException(ResponseEnums responseEnums) {
        this.responseEnums = responseEnums;
    }

    public ResponseEnums getResponseEnums() {
        return responseEnums;
    }

    public void setResponseEnums(ResponseEnums responseEnums) {
        this.responseEnums = responseEnums;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
