
/*
  demonstrate on nested if take the input from the users.
  name : nivedita sasane 
  date : 13/10/2022.
 */

package If_loop;
import java.util.Scanner;
public class Grade {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter Number");
		int percentage = 100;
		String grade = input.nextLine();
		
		if (percentage >= 90) {
			grade = "A";	
		}
		else if(percentage >= 84) {
			grade = "A1";
			
		}
		else if(percentage >= 74) {
			grade = "B";
			
		}
		else if(percentage >= 64) {
			grade = "C";
		}
		
		else if(percentage >= 42) {
			grade = "C";
		}
		
		else if(percentage >= 34) {
			grade = "F";
			
	}
		System.out.println("the grade is" + grade);
		

	}
}
