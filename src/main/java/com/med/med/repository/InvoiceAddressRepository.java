package com.med.med.repository;

import com.med.med.domain.InvoiceAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceAddressRepository extends JpaRepository<InvoiceAddress, Long> {
}
