package INTERFACE;

 interface Interfaces {

	void getArea(int side);
}

 class Square implements Interfaces
 {
	 public void getArea(int side)
	 {
		 System.out.println("The  of Squre : "+side*side);
	 }
 }