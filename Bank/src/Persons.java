
public class Persons {

	String firstName;
	String surName;
	int age;
	double balance;
	
	
	void balanceCheck()
	{
		if (balance > 0)
			System.out.println("Your balance is: " + balance);
		if (balance < 0)
			System.out.println("Your debit is: " + balance);
		if (balance == 0)
			System.out.println("No MoMo Bro!");
	}
	
}
