package com.jpsolutions.service;

import org.springframework.stereotype.Service;

import com.jpsolutions.dto.LoginDto;
import com.jpsolutions.dto.UserDto;
import com.jpsolutions.model.User;

@Service
public interface ILoginService {

	public User login(LoginDto dto) throws Exception;
	public User register(UserDto dto) throws Exception;
}
