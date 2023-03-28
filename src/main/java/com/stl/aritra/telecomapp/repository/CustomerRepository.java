package com.stl.aritra.telecomapp.repository;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stl.aritra.telecomapp.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Serializable>{
	
}
