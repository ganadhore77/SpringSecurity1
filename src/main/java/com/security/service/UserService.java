package com.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.entity.User;
import com.security.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	public User register(User user) {
		
		user.setPassword(encoder.encode(user.getPassword()));

		User dbuser = userRepository.save(user);
		return dbuser;

	}

	public List<User> getUsers() {

		List<User> dbuser = userRepository.findAll();
		return dbuser;

	}

}
