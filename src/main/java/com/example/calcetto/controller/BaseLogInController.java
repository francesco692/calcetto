package com.example.calcetto.controller;

import com.example.calcetto.model.ResponseLogIn;

public class BaseLogInController {

    protected ResponseLogIn setResponse(ResponseLogIn response, Object content, String token, String msg) {
        response.setStatus(true);
        response.setContent(content);
        response.setToken(token);
        response.setMsg(msg);
        return response;
    }

    protected ResponseLogIn setResponseError(ResponseLogIn response, Exception e) {
        response.setStatus(false);
        response.setContent("");
        response.setMsg("");
        response.setToken("");
        response.setError(e.getMessage());
        return response;
    }

}
