package com.stl.aritra.telecomapp.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stl.aritra.telecomapp.model.Connection;


@Repository
public interface ConnectionRepository extends CrudRepository<Connection, Serializable>{
	

}
