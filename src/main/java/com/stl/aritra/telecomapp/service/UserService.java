package com.stl.aritra.telecomapp.service;

import java.util.List;

import com.stl.aritra.telecomapp.model.User;

public interface UserService {
	

	public User saveUser(User user);
	
	public List<User> getListByCity(String city);

	public User getById(Integer id);
	
}
                                                     




