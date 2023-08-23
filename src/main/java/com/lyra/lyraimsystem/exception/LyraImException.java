package com.lyra.lyraimsystem.exception;

import com.lyra.lyraimsystem.common.ResponseEnums;

/**
 * 统一异常处理
 */
public class LyraImException extends RuntimeException {
    private ResponseEnums responseEnums;

    public LyraImException(ResponseEnums responseEnums) {
        this.responseEnums = responseEnums;
    }

    public ResponseEnums getResponseEnums() {
        return responseEnums;
    }

    public void setResponseEnums(ResponseEnums responseEnums) {
        this.responseEnums = responseEnums;
    }
}
