package com.med.med.controller;

import com.med.med.domain.Customer;
import com.med.med.exception.customer.CustomerDuplicateEntryException;
import com.med.med.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /*
    * URL: /api/v1/vertile/{vertileId}
    * Method: GET
    * @Param vertileId
    * */
    @GetMapping(value = "vertile/{vertileId}")
    public ResponseEntity addvertileId(@PathVariable String vertileId)  throws CustomerDuplicateEntryException {
        Customer customer = new Customer();
        customer.setVertileId(vertileId);
        return customerService.addvertile(customer);
    }
}
