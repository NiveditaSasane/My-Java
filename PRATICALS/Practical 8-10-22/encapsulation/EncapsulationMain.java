package encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Encapsulations e = new Encapsulations();
		e.setAge(20);
		e.setPincode(12356);
		e.setName("Nivedita");
		
		System.out.println("Myself : "+e.getName());
		System.out.println("My age is :  "+e.getAge());
		System.out.println("And My City Pincode is : "+e.getPincode());
	}

}
