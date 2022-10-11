/*
 program to demonstrate switch case and printing week days
 name = nivedita sasane
 date = 11-10-2022
 */

package Case;
import java.util.Scanner;
public class Switchcase {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your day : ");
		
		int week = sc.nextInt();
		switch(week)
		{
		case 1:
			System.out.println("monday");
			break;
			
		case 2:
			System.out.println("tuesday");
			break;
			
		case 3:
			System.out.println("wednesday");
			break;
			
		case 4:
			System.out.println("thursday");
			break;
			
		case 5:
			System.out.println("friday");
			break;
			
		case 6:
			System.out.println("saturday");
			break;
			
		case 7:
			System.out.println("sunday");
			break;
			
		default:
			System.out.println("invalid week");
			break;
		}
	}

}
