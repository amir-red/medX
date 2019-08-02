package com.med.med.service;

import com.med.med.domain.Customer;
import com.med.med.exception.customer.CustomerDuplicateEntryException;
import com.med.med.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public ResponseEntity addvertile(Customer customer) {
        final Customer customer1;
        try{
            customer1 = customerRepository.save(customer);
            return ResponseEntity.ok(customer1);
        } catch (RuntimeException e){
            throw new CustomerDuplicateEntryException("Duplicate Entry");
        }
    }

}
