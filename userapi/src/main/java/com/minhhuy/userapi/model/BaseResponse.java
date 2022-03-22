package com.minhhuy.userapi.model;

public class BaseResponse<T> {
    private long statusCode;
    private String message;
    private T result;

    public BaseResponse(long statusCode, String message, T result) {
        this.statusCode = statusCode;
        this.message = message;
        this.result = result;
    }

    public long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(long statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
