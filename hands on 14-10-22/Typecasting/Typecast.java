/*
 write a program for type casting.
 Name = nivedita sasane
 date = 14/10/22
 */
package Typecasting;
import java.util.Scanner;
public class Typecast {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter");
		int i = input.nextInt();
		
		
		//no explicit type casting required.
		long l=i;
		//no explicit type casting required.
		float f=l;
		
		System.out.println("enter the value is: " +i);
		System.out.println("enter the  value is: "+l);
		System.out.println("enter the  value is: "+f);
		
		
		
		
		
	}

}
