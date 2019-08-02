package com.med.med.exception.customer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
* CustomerControllerAdvice: responsible for Handling exception that are thrown
* */

@ControllerAdvice
public class CustomerControllerAdvice {

    @ResponseBody
    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String customerNotFoundHandler(CustomerNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(CustomerDuplicateEntryException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    String customerDuplicateEntryHandler(CustomerDuplicateEntryException ex) {
        return ex.getMessage();
    }
}
