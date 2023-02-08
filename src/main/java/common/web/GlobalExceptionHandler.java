package com.cy.pj.common.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.common.vo.JsonResult;

@RestControllerAdvice
public class GlobalExceptionHandler<T> {
	
	@ExceptionHandler(ServiceException.class)
    public JsonResult doHandleRuntimeException(RuntimeException e) {
        return new JsonResult(e);
    }
	
}
