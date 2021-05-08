package Homework5.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Homework5.business.abstracts.UserService;
import Homework5.core.LoggerService;
import Homework5.dataAccess.abstracts.UserDao;
import Homework5.entities.concretes.User;

public class UserManager implements UserService{
	private final UserDao userDto;
	private final LoggerService loggerService;

	public UserManager(UserDao userDto, LoggerService loggerService) {
		this.userDto = userDto;
		this.loggerService = loggerService;
	}
	@Override
	public void add(User user) {
		 checkIfValid(user);
	       
	        this.userDto.addUser(user);
	        this.loggerService.logToSystem("Kullanici Eklendi ->" + user.getFirstName());
		
	}
	@Override
	public void checkIfValid(User user) {
		
		String email = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPath = Pattern.compile(email, Pattern.CASE_INSENSITIVE);
		Matcher matcher =emailPath.matcher(user.getEmail());
		
		if(matcher.find()==false){
			throw new IllegalStateException("Yanl�� E-posta");
			
			}else {
			System.out.println("�ifre minimum 6 olmal�d�r");	
			
			 if(user.getFirstName().length()<2){
				 
		            throw new IllegalStateException("�sim en az 2 karakter olmal�d�r");
		        }
			 
		        if(user.getLastName().length()<2){
		            throw new IllegalStateException("Soyad az 2 karakter olmal�d�r");
		            
		        }
		        this.userDto.addUser(user);
		    }
	}
	@Override
	public void sendVerification(User user) {
		System.out.println("Do�rulama Kodu g�nder");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean ActivateUser(User user) {
		return true;
	}

	

		
	}

