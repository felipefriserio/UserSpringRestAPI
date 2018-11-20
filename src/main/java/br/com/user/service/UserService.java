package br.com.user.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.user.model.User;
import br.com.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		return this.userRepository.save(user);
	}
	
	public Optional<User> findById(int id) {
		return userRepository.findById(id);
	}
	
	public Collection<User> findAll() {
		return userRepository.findAll();
	}
	
	public Collection<User> findByName(String name) {
		return userRepository.findByName(name);
	}
}
