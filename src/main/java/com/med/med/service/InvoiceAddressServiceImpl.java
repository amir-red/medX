package com.med.med.service;

import com.med.med.domain.InvoiceAddress;
import com.med.med.repository.InvoiceAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceAddressServiceImpl implements InvoiceAddressService {

    @Autowired
    private InvoiceAddressRepository invoiceAddressRepository;

    @Override
    public void saveInvoiceAddress(InvoiceAddress invoiceAddress) {
            invoiceAddressRepository.save(invoiceAddress);
    }
}
