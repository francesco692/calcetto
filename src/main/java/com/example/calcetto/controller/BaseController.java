package com.example.calcetto.controller;

import com.example.calcetto.model.ResponseDTO;

public class BaseController {

    protected ResponseDTO setResponse(ResponseDTO response, Object content, String msg) {
        response.setStatus(true);
        response.setContent(content);
        response.setMsg(msg);
        return response;
    }

    protected ResponseDTO setResponseError(ResponseDTO response, Exception e) {
        response.setStatus(false);
        response.setContent(false);
        response.setMsg("");
        response.setError(e.getMessage());
        return response;
    }

}
