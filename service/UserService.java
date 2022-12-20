package com.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.User;

@Service
public interface UserService {

	public String saveUser(User user);
	public List<User> getUserPlanName(String planName);
}
