package com.nksofttech.posweb.controller;

import com.nksofttech.posweb.dto.CustomerDTO;
import com.nksofttech.posweb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @PostMapping("save-customer")
  public String saveCustomer(@RequestBody CustomerDTO customerDTO){

    customerService.saveCustomer(customerDTO);

    return "";
  }

}
