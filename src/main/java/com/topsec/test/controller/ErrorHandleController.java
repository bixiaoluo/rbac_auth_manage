package com.topsec.test.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;

/**
 * Created by jiyujing on 2017/11/7.
 */

public class ErrorHandleController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "error";
    }
}
