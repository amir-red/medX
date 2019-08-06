package com.med.med.service;

import com.med.med.domain.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    ResponseEntity addvertile(Customer customer);

    ResponseEntity addprestaShopId(String vertileId, String prestaShopId);
}
