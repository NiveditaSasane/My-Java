package operator;
import java.util.Scanner;

 class Relational {
	 public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter 1st number: ");
		    int num1 = sc.nextInt();
		    
		    System.out.print("Enter 2st number: ");
		    int num2 = sc.nextInt();
		 sc.close();
		 //performing equal to operation.
		 System.out.println("num1==num2: "+(num1==num2));
		 
		 //performing not equal to operation.
		 System.out.println("num1!==num2: "+(num1!=num2));
		
		//performing greater to operation. 
		 System.out.println("num1>num2: "+(num1>num2));
		 
		//performing less to operation.
		 
		 System.out.println("num1<num2: "+(num1<num2));
		 
		 //performing greater to operation.
		  System.out.println("num1>num2: "+(num1>num2));
		
		  //performing less to operation.
		  System.out.println("num1<num2: "+(num1<num2));
		  
		  
			
			
	 }
}
