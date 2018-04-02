package com.afanasyev.bootmvcdatafreemarker.service;

import com.afanasyev.bootmvcdatafreemarker.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer getById(Integer id);
    List<Customer> findAll();

    void save(Customer user);
    void update(Customer user);
    void delete(Integer id);
}
