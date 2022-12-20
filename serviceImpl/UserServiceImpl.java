package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.User;
import com.main.repository.UserRepository;
import com.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repo;

	@Override
	public String saveUser(User user) {
		if (user.getId() == null) {
			repo.save(user);
			return "User Data Saved Successfully";
		} else {
			return "User Data failed to save";
		}
	}

	@Override
	public List<User> getUserPlanName(String planName) {

			return repo.findByPlanName(planName);
	}

}
