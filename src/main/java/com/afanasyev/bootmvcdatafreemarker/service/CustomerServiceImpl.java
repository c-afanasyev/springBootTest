package com.afanasyev.bootmvcdatafreemarker.service;


import com.afanasyev.bootmvcdatafreemarker.entity.Customer;
import com.afanasyev.bootmvcdatafreemarker.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer getById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void update(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
