package com.lyra.lyraimsystem.exception;

import com.lyra.lyraimsystem.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 */
@RestControllerAdvice
public class IMExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(IMExceptionHandler.class);

    @ExceptionHandler(value = LyraImException.class)
    public Result<Object> exceptionHandler(LyraImException lyraImException) {
        log.error(lyraImException.getMessage());

        if (lyraImException.getData() != null) {
            return new Result<>(lyraImException.getResponseEnums(), lyraImException.getData());
        }

        return new Result<>(lyraImException.getResponseEnums(), lyraImException.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public Result<Object> handler(Exception e) {
        log.error(e.getMessage());

        return Result.filed(e.getMessage());
    }
}
