package com.pluralsight.service;

import com.pluralsight.repository.CustomerRepository;

public interface CustomerService {
    public CustomerRepository getCustomerRepository();
    void setCustomerRepository(CustomerRepository customerRepository);
}
