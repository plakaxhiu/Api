package com.example.rest.api.service;

import java.util.List;
import java.util.Optional;

import com.example.rest.api.entity.User;

public interface IUserService {
	public List<User> getAllUser();

	public Optional<User> getUser(Long id);

	public List<User> findByUsernameList(String username);
}
