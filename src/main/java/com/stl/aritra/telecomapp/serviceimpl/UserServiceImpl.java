package com.stl.aritra.telecomapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stl.aritra.telecomapp.model.User;
import com.stl.aritra.telecomapp.repository.UserRepository;
import com.stl.aritra.telecomapp.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;



	@Override
	@Transactional
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getListByCity(String city) {
		List<User> user = userRepository.findByCity(city);
		return user;
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}
}
