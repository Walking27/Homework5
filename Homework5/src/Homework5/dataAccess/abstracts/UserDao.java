package Homework5.dataAccess.abstracts;

import Homework5.entities.concretes.User;

public interface UserDao {
	
	void addUser(User user);
    void checkIfValid(User user);
    void sendVerification(User user);
    Boolean ActivateUser(User user);

}
