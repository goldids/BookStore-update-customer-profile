package com.cg.book.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.book.customer.CustomerInformation;

@Repository
public interface ICustomerDAO extends CrudRepository<CustomerInformation, Integer>{

}
