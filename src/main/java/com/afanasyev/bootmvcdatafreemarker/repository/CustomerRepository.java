package com.afanasyev.bootmvcdatafreemarker.repository;


import com.afanasyev.bootmvcdatafreemarker.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
