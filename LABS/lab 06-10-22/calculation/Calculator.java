/*
 create a program for calculator.read three values from the user for operation
 first and second values as operands.
 third values as operator.
 if user press1=>print addition of first and second
 if user press2=>print subtraction of first and second
 if user press3=>print multiplication of first and second
 if user press4=>print division of first and second
 
  @uther : Nivedita sasane
  date : 06-10-2022
  */

package calculation;
import java.util.Scanner;
public class Calculator {
	public static void main(String[]args)
	{
	//char operator;
	Double num1,num2,result;
	
	//creating Scanner object
	
		Scanner input= new Scanner(System.in);
		
		//ask user to enter operator
		System.out.println("Choose an operator: +,-,*,or /");
		char operator = input.next().charAt(0);
		
		//taking first value from user
		System.out.println("enter first value");
		num1 = input.nextDouble();
		
		//taking second value from user
		System.out.println("enter second value");
		num2 = input.nextDouble();
		
		switch(operator) {
		//perform addition between numbers
		case '+':
		result = num1 + num2;
		System.out.println(num1 + "+" + num2 +"=" + result);
		break;
		
		//perform subtraction between numbers
				case '-':
				result = num1 - num2;
				System.out.println(num1 + "-" + num2 +"=" + result);
				break;
				
				
				//perform multiplication between numbers
				case '*':
				result = num1 * num2;
				System.out.println(num1 + "*" + num2 +"=" + result);
				break;
				
				
				//perform divission between numbers
				case '/':
				result = num1 + num2;
				System.out.println(num1 + "+" + num2 +"=" + result);
				break;
				
				
				
				
		
		}
		                        
		
	}
	

}
