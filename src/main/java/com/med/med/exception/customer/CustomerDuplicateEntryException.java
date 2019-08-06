package com.med.med.exception.customer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
* CustomerDuplicateEntryException: is thrown if customer vertileId || prestaShopId is duplicated
* */

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CustomerDuplicateEntryException extends RuntimeException{

    public CustomerDuplicateEntryException(String id) {
        super("CustomerModel Exception: " + id);
    }
}
