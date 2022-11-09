package operator;
import java.util.Scanner;

public class Assignment {
	 public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter 1st number: ");
		    int num1 = sc.nextInt();
		    
		    System.out.print("Enter 2st number: ");
		    int num2 = sc.nextInt();
		    sc.close();
		    //adding and assigning values.
		    num1+=num2;
		    System.out.println("num1=:" +num1);
		    
		    num1-=num2;
		    System.out.println("num1=:" +num1);
	
		    num1*=num2;
		    System.out.println("num1=:" +num1);
	
		    num1/=num2;
		    System.out.println("num1=:" +num1);
	
		    num1%=num2;
		    System.out.println("num1=:" +num1);
	
}
}