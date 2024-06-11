package com.jpsolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpsolutions.dto.LoginDto;
import com.jpsolutions.dto.UserDto;
import com.jpsolutions.model.User;
import com.jpsolutions.service.ILoginService;

@RestController
public class LoginController {

	@Autowired
	private ILoginService service;

	@PostMapping("/login")
	public User login(@RequestBody LoginDto dto) throws Exception {
		User user = service.login(dto);
		return user;
	}

	@PostMapping("/register")
	public User login(@RequestBody UserDto dto) throws Exception {
		User user = service.register(dto);
		return user;
	}

}