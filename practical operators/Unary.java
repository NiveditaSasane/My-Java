package operator;
import java.util.Scanner;

public class Unary {
	 public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter 1st number: ");
		    int num1 = sc.nextInt();
		    sc.close();
		    
		    //performing pre increment operation.
		    ++num1;
		    System.out.println("pre increment value: " + num1);
		    
		    //performing post increment operation.
		    num1++;
		    System.out.println("post increment value: " + num1);
		    
		    //performing pre decrement operation.
		    --num1;
		    System.out.println("pre decrement value: " + num1);
		    
		    //performing post decrement operation.
		    num1--;
		    System.out.println("post decrement value: " + num1);

}
}