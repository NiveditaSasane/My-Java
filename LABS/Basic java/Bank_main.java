package Basicjava  ;

public class Bank_main {
	public static void main (String[] args)
	{
		Bank b1 = new Bank();
		
		b1.BankDetails();
		b1.employee();
		
		SbiBank s1 = new SbiBank();
		
		s1.BankDetails();
		s1.employee();
		
		Bankofbaroda b2 = new Bankofbaroda();
		
		b2.BankDetails();
		b1.employee();
		
		
	}

}
