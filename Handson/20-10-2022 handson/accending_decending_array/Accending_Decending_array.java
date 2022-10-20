/*
Question : Ascendind and Descending order in array.
Name : Nivedita Sasane.
date : 20/10/2022.
*/

package accending_decending_array;
//import java.util.Arrays;
import java.util.*;
public class Accending_Decending_array {
public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);//taking input from user.
			
			System.out.println("enter the no of element in array ");
			
			int a = sc.nextInt();
			//int array[]=new int[a];
			Integer Array[]=new Integer [a];
			
			System.out.println("enter the elements ");
			
			for(int i =0;i<a;i++)// for loop
			{
				Array[i]=sc.nextInt();
				
			}
			System.out.println("Original array"+Arrays.toString(Array));
			
			Arrays.sort(Array);
			System.out.println("Sorted array is"+Arrays.toString(Array));//Ascending order
			
			Arrays.sort(Array,Collections.reverseOrder());
			System.out.println("Sorted array is"+Arrays.toString(Array));//Descending order
		}
			

	}



