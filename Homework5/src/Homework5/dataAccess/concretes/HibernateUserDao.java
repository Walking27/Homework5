package Homework5.dataAccess.concretes;

import Homework5.dataAccess.abstracts.UserDao;
import Homework5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	
	@Override
	public void addUser(User user) {
		System.out.println("Hibernate ile eklendi "+user.getFirstName());
		
	}

	@Override
	public void checkIfValid(User user) {
		System.out.println("Hibernate ile 100% dogurlandý "+user.getFirstName());
		
	}

	@Override
	public void sendVerification(User user) {
		 System.out.println("Hibernate ile dogrulama kodu gönderildi "+user.getFirstName());
		
	}

	@Override
	public Boolean ActivateUser(User user) {
		return true;
	}
}
