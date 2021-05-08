package Homework5.business.abstracts;

import java.util.List;

import Homework5.entities.concretes.User;

public interface UserService {
	
	void add(User user);
    void checkIfValid(User user);
	void sendVerification(User user);
	Boolean ActivateUser(User user);
	List<User> getAll();

}
