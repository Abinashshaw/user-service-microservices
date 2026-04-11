package com.learn.user.exceptions;

import com.learn.user.payload.ApiRespose;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserException.class)
    public ResponseEntity<ApiRespose> UserExceptionHandler(String message){
        ApiRespose response = ApiRespose.builder().message(message).success(true).status(HttpStatus.OK).build();
        return ResponseEntity.ok(response);
    }

}
