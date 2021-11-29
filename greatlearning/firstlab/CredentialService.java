package com.greatlearning.firstlab;

import java.util.Random;

public class CredentialService {
	
	private String email;
	private String pass;
	
	
	void generatePassword(){
		String passwordCharacters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
		char password[]=new char[8];
		Random ran = new Random();
		for(int i =0;i<8;i++) {
			int n=ran.nextInt(passwordCharacters.length());
			//System.out.println(n);
			password[i]=passwordCharacters.charAt(n);
		}	
		pass= String.valueOf(password);

	}

	void generateEmailAddress(String dept,String name){
		 email=name+"@"+dept+".abc.com";
		
	}
	
	void showCredentials(String first) {
		System.out.println("Dear "+first+" your generated credentials are as follows:");
		System.out.println("Email       ---> "+email);
		System.out.println("Password    --->"+pass);
	}
}
