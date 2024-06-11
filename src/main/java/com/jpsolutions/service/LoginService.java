package com.jpsolutions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpsolutions.dto.LoginDto;
import com.jpsolutions.dto.UserDto;
import com.jpsolutions.model.User;
import com.jpsolutions.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LoginService implements ILoginService {

	@Autowired
	private UserRepository repository;

	public User login(LoginDto dto) throws Exception {
		User user = repository.getUserByEmail(dto.getEmail());
		if (user != null && (user.getPassword().equals(dto.getPassword()))) {
			return user;
		}

		throw new Exception("Something is wrong. email or password?");
	}

	public User register(UserDto dto) throws Exception {
		if (dto.getName() == null || dto.getName().trim() == "")
			throw new Exception("Blank name");
		if (dto.getEmail() == null || dto.getEmail().trim() == "")
			throw new Exception("Blank email");
		if (dto.getPassword() == null || dto.getPassword().trim() == "")
			throw new Exception("Blank password");

		User user = new User(dto);
		user = repository.save(user);
		return user;
	}
}
