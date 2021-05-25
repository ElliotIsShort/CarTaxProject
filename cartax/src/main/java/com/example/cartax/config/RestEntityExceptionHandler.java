package com.example.cartax.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestEntityExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(value = {NumberFormatException.class})
    protected ResponseEntity<Object> numberFormatExceptionHandler(RuntimeException ex, WebRequest request)
    {
        String text = "Input Failed, please enter a number.";
        return handleExceptionInternal(ex, text, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
