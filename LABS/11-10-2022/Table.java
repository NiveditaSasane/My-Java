/*
 print any multiplication table using for loop take the input from the user in all the program
 name = nivedita sasane 
 date = 11-10-2022
 */

package loop1;
import java.util.Scanner;
public class Table {
       
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt(); 
		for(int i = 1 ; i <= 10; ++i)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}
