package operator;
import java.util.Scanner;

public class Bitwise {
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter 1st number: ");
		    int num1 = sc.nextInt();
		    
		    System.out.print("Enter 2st number: ");
		    int num2 = sc.nextInt();
		    sc.close();
		    //bitwise AND operators
		    System.out.println("num1&&num2="+(num1 & num2));
		    //0 1 0 1
		    //0 1 1 0
		    //-------
		    //0 1 0 0=4
		    
		  //bitwise OR operator
		    System.out.println("num1|num2="+(num1 | num2));
		    //0 1 0 1
		    //0 1 1 0
		    //--------
		    //0 1 1 1=7
		    
		  //bitwise XOR operator
		    System.out.println("num1^num2="+(num1 ^ num2));
		    //0 1 0 1
		    //0 1 1 0
		    //-------
		    //0 0 1 1=3
		    
		  
		   
		    
		    
	}
}
