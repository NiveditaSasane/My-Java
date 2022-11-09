class Employees
{
	String name;
	String address;
	
	static String company_name;
	static int salary;

	void displaydata()
	{
	 System.out.println(name +" "+address);
	}

	static String completedTargets()
	{ 
	return "completed targets quickly" ;
 	}

	void AttendingMeetings(String s)
	{
		System.out.println(s);
	}

public static void main (String[]args)
{
Employees e1=new Employees();
Employees e2=new Employees();
Employees e3=new Employees();
e1.address="Thane";
e1.name="Nivedita";

e2.address="Ordnance Factory Amb";
e2.name="Ojesvi";

e3.address="Badlapur";
e3.name="Riva";

e1.displaydata();
e2.displaydata();
e3.displaydata();
System.out.println();
}
}