package com.blogproject.Blog.Application.exception;

import com.myblog.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorDetails> resourceNotFound(
        ResourceNotFound ex,
                WebRequest webRequest){

        ErrorDetails err= new ErrorDetails(new Date(),ex.getMessage(), webRequest.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);

    }

}
