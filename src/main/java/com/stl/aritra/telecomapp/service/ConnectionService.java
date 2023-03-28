package com.stl.aritra.telecomapp.service;

import java.util.Optional;

import com.stl.aritra.telecomapp.model.Connection;


public interface ConnectionService {
	

	public Iterable<Connection> getAllConnection(); 
	public Connection saveConnection(Connection connection);
	public Optional<Connection> getConnectionById(Integer Id);
	public void deleteConnection(Integer id);
	
}
