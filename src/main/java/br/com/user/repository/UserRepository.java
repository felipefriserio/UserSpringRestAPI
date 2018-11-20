package br.com.user.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User save(User user);
	
	Optional<User> findById(Integer id);
	
	Collection<User> findAll();
	Collection<User> findByName(String name);
	
}
