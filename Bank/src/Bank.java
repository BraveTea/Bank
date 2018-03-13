class Bank {
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
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
		
		
		
		p1.creditCheck();
		p2.withdrawal(100);
		p2.withdrawal(50);
		p2.withdrawal(100);
		p1.balancePrint();
	
		
	}
}