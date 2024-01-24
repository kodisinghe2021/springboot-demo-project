package com.nksofttech.posweb.service;

import com.nksofttech.posweb.dto.CustomerDTO;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CustomerService {
  public String saveCustomer(CustomerDTO customerDTO);

}
