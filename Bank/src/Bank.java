class Bank {
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Persons ps1 = new Persons();
		
		ps1.balance = 123.0;
		
		p1.age = 18;
		p1.firstName = "Richard";
		p1.surName = "Lionheart";
		p1.credit = 1000;
		p1.debet = 0;
		
		p2.age = 16;
		p2.firstName = "Peter";
		p2.surName = "Richardson";
		p2.credit = 238.6;
		p2.debet = 0.0;
		
		p3.age = 83;
		p3.firstName = "Leonard";
		p3.surName = "Bernstein";
		p3.credit = 100392.3;
		p3.debet = 0.0;
				
		p4.age = 22;
		p4.firstName = "Kurt";
		p4.surName = "Cobain";
		p4.credit = 0;
		p4.debet = 833.5;
		
				
		p1.creditCheck();
		p2.withdrawal(100);
		p2.withdrawal(50);
		p2.withdrawal(100);
		p1.balancePrint();
		p4.creditCheck();
		p4.balancePrint();
		p4.deposit(100);
		p4.deposit(800);
		System.out.println("");
		ps1.balanceCheck();
		
	
		
	}
}