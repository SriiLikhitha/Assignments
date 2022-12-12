package com.axis.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.axis.crud.model.Customer;
@Repository

public interface CustomerRespository extends JpaRepository<Customer, Integer>{

}
