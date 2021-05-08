package Homework5;

import Homework5.business.abstracts.UserService;
import Homework5.business.concretes.UserManager;
import Homework5.core.JLoggerManagerAdapter;
import Homework5.dataAccess.concretes.AbcUserDto;
import Homework5.dataAccess.concretes.HibernateUserDao;
import Homework5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
	UserService userService = new UserManager(new AbcUserDto(), new JLoggerManagerAdapter());
	
	User user1 = new User(1,"yusuf","Özabuþ","Yusuf@gmail.com",123456);
	User user2 = new User(1,"Emine","Özabuþ","Emine@gmail.com",1234567);
	
	userService.add(user1);

	}

}
