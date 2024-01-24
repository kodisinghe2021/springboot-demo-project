package com.nksofttech.posweb.service.impl;

import com.nksofttech.posweb.dto.CustomerDTO;
import com.nksofttech.posweb.entity.Customer;
import com.nksofttech.posweb.repo.CustomerRepo;
import com.nksofttech.posweb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {
  @Autowired
  private CustomerRepo customerRepo;
  // converting DTO to ENTITY
  private  Customer customer;
  @Override
  public String saveCustomer(CustomerDTO customerDTO) {

    customer = new Customer(
            customerDTO.getCustomerId(),
            customerDTO.getCustomerName(),
            customerDTO.getCustomerAddress(),
            customerDTO.getCustomerSalary(),
            customerDTO.getContactNumber(),
            customerDTO.getNic(),
            customerDTO.isActive()
    );

    System.out.println("ADDRESS : "+customerDTO.getCustomerAddress());

    customerRepo.save(customer);
    return customerDTO.getCustomerName();
  }

}




