package com.example.calcetto.model;

public class ResponseLogIn {

    public ResponseLogIn() {
        this.status = false;
        this.token = "";
        this.msg = "";
        this.error = "";
    }

    private Boolean status;
    private Object content;
    private String token;
    private String msg;
    private String error;

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Object getContent() {
        return content;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public void setContent(Object content) {
        this.content = content;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
}
