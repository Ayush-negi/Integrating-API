package com.ayush.Project1.controlleradvices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ayush.Project1.exceptions.ProductNotFoundException;

@ControllerAdvice
public class globalExecptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<Void> handleProductNotFoundException() {

        return new ResponseEntity<>(
                HttpStatus.BAD_REQUEST
        );
    }

}
