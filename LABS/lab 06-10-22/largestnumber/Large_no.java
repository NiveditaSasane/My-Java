/*
 craete a program to find largest of two number
 @uthor : Nivedita Sasane
 date : 06-10-2022 
 */


package largestnumber;
import java.util.Scanner;
public class Large_no {
	public static void main(String[]args)
	{
		int number1,number2,largest;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter thr first number: ");
		number1 = scan.nextInt();
		
		System.out.print("enter thr second number: ");
		number2 = scan.nextInt();
		
		if (number1>number2)
			largest = number1;
		else
			largest = number2;
		 System.out.println("\nlargest = " +largest);
	
	}
	

}
