package com.lyra.lyraimsystem.exception;

import com.lyra.lyraimsystem.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class IMExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(IMExceptionHandler.class);

    @ExceptionHandler(value = LyraImException.class)
    public Result<Object> exceptionHandler(LyraImException lyraImException) {
        log.error(lyraImException.getMessage());

        return new Result<>(lyraImException.getResponseEnums());
    }

    @ExceptionHandler(value = Exception.class)
    public Result<Object> handler(Exception e) {
        log.error(e.getMessage());

        return Result.filed();
    }
}
