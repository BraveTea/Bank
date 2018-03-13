
public class Person {

	String firstName;
	String surName;
	int age;
	double credit;
	double debet;
	
	void withdrawal(double x)
	{
		if (credit < x)
		{
			System.out.println("Your balance is insufficient for this withdrawal");
		}
		else
		{
		System.out.println("You have just withdrawn: " + x);
		credit = credit - x;
		System.out.println("current balance is: " + credit);
		}
	}
	
	void deposit(double x)
	{
		System.out.println("You have just deposited: " + x);
		credit = credit + x;
		System.out.println("current balance is: " + credit);
	}
	
	void creditCheck()
	{
		if (credit < 500)
		{
			System.out.println(firstName + surName + " doesn't have enough money");
		}
		else
		{
			System.out.println(firstName + " " + surName + " has plenty of dough");
		}
	}
	
	void balancePrint()
	{
		System.out.println("Your account balance is: " + credit);
	}
	
}
