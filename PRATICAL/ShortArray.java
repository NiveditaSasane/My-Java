/* SHORTING A ARRAY PROGRAM
 * DATE :- 19-10-22
 */

package Nivedita;
import java.util.Arrays;
import java.util.Scanner;

public class ShortArray {
	
	public static void main(String... args) 
	{
		//using Scanner to take input from user 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the "+ size+ " elements of an array");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		//to arrange arrays in ascending order we used sort method.
		// Array is not a variable
		Arrays.sort(a);
		System.out.println("\nResult");
		
		// using For-each loop
		for(int n:a)
		{
			System.out.print(n+" ");
		}
	
			}
}


