package com.example.quartz;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {

        customer.setFirstName(customer.getFirstName().toUpperCase());
        return customer;
    }
}

