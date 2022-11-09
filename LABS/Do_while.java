/*
 program to demonstrate do while and print the reverse counting from the user input number
 name : nivedita sasane
 date : 12/10/2022.
 */


package Dowhile_loop;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,s,reversed_Num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of find reverse: ");
		num=sc.nextInt();
		do {
			s=num%10;
			reversed_Num=reversed_Num*10+s;
		    num=num/10;	
		}
		while(num>0);
		System.out.print("you entered: "+num);
		System.out.print("reverse of the number is: "+reversed_Num);
	}
}

		
			
		