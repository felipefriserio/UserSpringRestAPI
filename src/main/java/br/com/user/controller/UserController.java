package br.com.user.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.user.model.User;
import br.com.user.service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/find/{id}")
	public Optional<User> findById(@PathVariable int id){
		return this.userService.findById(id);
	}
	
	@GetMapping("/list")
	public Collection<User> findAll(){
		return this.userService.findAll();
	}
	
	@GetMapping("/list/{name}")
	public Collection<User> findByname(@PathVariable String name){
		return this.userService.findByName(name);
	}
	
	@PostMapping
	public User create(@RequestBody User user) {
		return this.userService.save(user);
	} 
}
