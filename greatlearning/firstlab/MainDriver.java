package com.greatlearning.firstlab;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Credential Generation Portal!");
		System.out.println("Please enter your first name");
		String fn = sc.next();
		System.out.println("Please enter your last name");
		String ln = sc.next();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
		int temp = sc.nextInt();
		sc.close();
		
		Employee emp =new Employee(fn,ln);
		CredentialService cred =new CredentialService();
		
		String fullname =(emp.getFirstName()+emp.getLastName());
		
		switch(temp){
		
		case 1: 
		    cred.generateEmailAddress("tech",fullname);
			cred.generatePassword();
			cred.showCredentials(fn);break;
			
		case 2:
			cred.generateEmailAddress("admin",fullname);
			cred.generatePassword();
			cred.showCredentials(fn);break;
			
		case 3:
			cred.generateEmailAddress("hr",fullname);
			cred.generatePassword();
			cred.showCredentials(fn);break;
			
		case 4:
			cred.generateEmailAddress("legal",fullname);
			cred.generatePassword();
			cred.showCredentials(fn);break;
			
		default: System.out.println("you have entered incorect option"); 
	
		}





	}

}
