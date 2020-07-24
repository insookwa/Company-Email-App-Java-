package EmailApp;

import java.util.Scanner;

public class Email {
	
	String FirstName;
	String SecondName;
	String Department;
	String Password;
	private int passwordlength=8;
	int maiboxCapacity;
	String alternateEmail;
	String Email;
	String company_sufix = "company.com";
	
	
	//constructor to recive first name and last name 
	public Email(String FirstName,String SecondName) {
		this.FirstName = FirstName;
		this.SecondName = SecondName;
		System.out.println("Email Created: "+ this.FirstName+" "+this.SecondName);
		
		// method asking for department and returns department
		this.Department = setDepartment();
		System.out.println("Department: "+ this.Department );
		
		this.Password = randomPassword(passwordlength);
		System.out.println("Your password is "+ this.Password);
		
		//generate emails by combining stuff
		Email = FirstName.toLowerCase()+"."+SecondName.toLowerCase()+"@"+ Department +company_sufix;
		System.out.println("Your email is: "+Email);
		
		
	}
	//Asking for department 
	
	private String setDepartment() {
		Scanner console = new Scanner(System.in);
		System.out.println("Department Codes: \n1 for Sales \n2 for Dvelopment \n3 for accounting \n4 for None");
		int Dptchoice = console.nextInt();
		if(Dptchoice == 1) {return "sales" ;}
		else if(Dptchoice ==2) {return "Development";}
		else if(Dptchoice == 3) {return "Accounting";}
		else {return "";}
		
	}
	//method to generate a random password 
	
	private String randomPassword(int length) 
	{
		String PasswordSet = "qwertyuiopasdfghjklzxcvbnm1234567890@#$%^&";
		char [] password = new char[length];
		for(int i=0;i<length; i++)
		{
			int rand = (int)(Math.random()*PasswordSet.length());
			password[i]=PasswordSet.charAt(rand);
		}
		
		return new String(password); 
		
	}
	
	// set Show emails 
	public void setMailboxCapacity(int capacity)
	{
		this.maiboxCapacity = capacity;
	}
	//set alternate program 
	public void setalternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	// set change password 
	public void  changePassword(String password) 
	{
		this.Password = password;
	}
	// getters 
	public int getMailboxCapaxity() {return maiboxCapacity;}
	public String getalternateEmail() {return alternateEmail;}
	public String getPassword() {return Password;}
	
	



//methid to show information 

public String showinfo() {
	return "Name: "+ FirstName+" "+SecondName +
	        "\nDepartment/; "+Department +
	        "\nEmail; "+Email;
}
}
