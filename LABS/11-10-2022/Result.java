/*
 demonstrate if-else statement of 5 subject the person who gets above 60% will be passed other wise failed output should be like Enter your name Enter marks of the 5 subject
 name = nivedita sasane
 date = 11-10-2022

 */

package loop1;
import java.util.Scanner;
public class Result {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark of the five subject");
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		int subject4 = sc.nextInt();
		int subject5 = sc.nextInt();
		
		sc.close();
		
		int total;
		int percentage;
		
		//calculate total and percentage 
		total = subject1 + subject2 + subject3 + subject4 + subject5;
		
		percentage =(int)((total / 500.0) * 100);
		
		//percentage you are pass or not 
		if (percentage >=60)
		{
			System.out.println("you are pass");
		}
		else	
		{
			System.out.println("you are fail");
		}
	}
}
