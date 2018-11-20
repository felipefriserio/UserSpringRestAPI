package br.com.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	
	@Id 
	private String id;
	private String name;
	private String lastName;
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
}
