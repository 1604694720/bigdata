package com.yang.J2SE.exception;

public class NameLengthException extends RuntimeException {
    public NameLengthException() {
        super("名字长度不能大于5！");
    }
}
