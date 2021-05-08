package Homework5.entities.concretes;

import Homework5.entities.abstracts.Entity;

public class User implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private int password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String firstName, String lastName, String email, int password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	

	
	

}
