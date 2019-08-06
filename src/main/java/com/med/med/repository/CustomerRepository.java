package com.med.med.repository;

import com.med.med.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT c.* FROM customer c where c.vertile_id = :vertileId", nativeQuery = true)
    Customer findByVertileId(@Param("vertileId") String vertileId);
}
