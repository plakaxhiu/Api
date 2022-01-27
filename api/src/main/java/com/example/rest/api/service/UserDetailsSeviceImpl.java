package com.example.rest.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rest.api.entity.User;
import com.example.rest.api.persistence.repository.UserRepository;

@Service
@Transactional
public class UserDetailsSeviceImpl implements UserDetailsService, IUserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;

	}

	@Override
	public List<com.example.rest.api.entity.User> findByUsernameList(String username) {
		List<com.example.rest.api.entity.User> allUserWithName = userRepository.findByusername("admin");
		return allUserWithName;
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();

	}

	@Override
	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}

}
