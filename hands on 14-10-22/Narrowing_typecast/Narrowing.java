/*
 wap a program narrowing type casting
 Name = nivedita sasane
 Name = 14/10/22
 */
package Narrowing_typecast;
import java.util.Scanner;
public class Narrowing {
	public static void main(String[]args) {
		double d;
		Scanner input=new Scanner(System.in);
		System.out.println("enter");
		d=input.nextInt();
		//explicit type casting required.
		long l=(long)d;
		//	//explicit type casting required.
		int i=(int)l;
		System.out.println("long value: " +l);
		System.out.println("int value: " +i);
		
		
	}
	

}
