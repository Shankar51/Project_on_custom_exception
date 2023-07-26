package sp;

import java.util.Scanner;

class invalidUserException extends Exception
{
	public String getMessage()
	{
		return"Invalid card detail.try again!";
	}
}

class ATM
{
	int acc_num = 12345;
	int password = 1111;
	int an,pwd;
	
	void acceptInput() 
	{
	 Scanner scan= new Scanner(System.in);
	 System.out.println("entet the acc_num");
	 an = scan.nextInt();
	 System.out.println("entet the password");
	 pwd = scan.nextInt();	
	}
	
	void verify() throws invalidUserException
	{
	if(acc_num == an && password == pwd)
	{
	System.out.println("collect your money");	
	}
	
	else
	{
		invalidUserException iue= new invalidUserException();
		System.out.println(iue.getMessage());
		throw iue;
	}
	
  }	
}


  class BANK
  {
	  void initiate()
	  {
		  ATM atm= new ATM();
		  try
		  {
			  atm.acceptInput();
			  atm.verify();  
		  }
		  catch(Exception e)
		  {
			 try 
			 {
				 atm.acceptInput();
				  atm.verify();
			 }
			 catch(Exception f)
			 {
				 try
				 {
					 atm.acceptInput();
					  atm.verify();
				 }
				 catch(Exception g)
				 {
					 System.out.println("Card is blocked ");
					 System.exit(0);
				 }
			 }
		  }
	  }
  }
        
public class Spp {

	public static void main(String[] args) {
		
		 BANK b = new BANK(); 
		 b.initiate();	
	}	

}
