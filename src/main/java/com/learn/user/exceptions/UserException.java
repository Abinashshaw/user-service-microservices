package com.learn.user.exceptions;

public class UserException extends RuntimeException{
    public UserException(String s) {
        throw new RuntimeException(s);
    }
}
