package com.med.med.exception.customer;

/*
* CustomerNotFoundException: is thrown if tries to access a customer w/c is not found
* */

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String id) {
        super("Could not find customer " + id);
    }

}
