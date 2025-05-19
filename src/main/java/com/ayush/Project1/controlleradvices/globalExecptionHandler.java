package com.ayush.Project1.controlleradvices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ayush.Project1.dtos.ProductNotFoundExceptionDto;
import com.ayush.Project1.exceptions.ProductNotFoundException;

@ControllerAdvice
public class globalExecptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<ProductNotFoundExceptionDto> handleProductNotFoundException() {

        ProductNotFoundExceptionDto dto = new ProductNotFoundExceptionDto();
        dto.setMessage("Product not found with the given id.");
        dto.setResolution("Please try passing a valid productId.");

        return new ResponseEntity<>(
                dto,
                HttpStatus.BAD_REQUEST
        );
    }

}
