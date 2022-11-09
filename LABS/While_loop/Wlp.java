






/*
 program to demonstrate while loop continues until entered number is positive
 name : nivedita sasane
 date : 12/10/2022
 */





package While_loop;

import java.util.Scanner;

public class Wlp {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);		
		//Test Condition.
		while(true)
		{
			System.out.println("Enter a  number: ");
			int firstN = input.nextInt();
			
			if(firstN<0)
			{
				System.out.println("Dhanywad");
				break;
			}

			
		}
		
	}

}


