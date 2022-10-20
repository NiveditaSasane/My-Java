/*
Question : Even Ascending order in array.
Name : Nivedita sasane.
date : 20/10/2022.

package even_accending_array;
//import java.util.Arrays;
import java.util.*;
public class Even_Accending_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of element in array ");
		
		int a = sc.nextInt();
		//int array[]=new int[a];
		Integer Array[]=new Integer [a];
		System.out.println("enter the elements ");
		for(int i =0;i<a;i++)// for loop
		{
			int p=sc.nextInt();
		    Array[i]=p;
			
	}      
		Arrays.sort(Array);
		System.out.println("even number in ascending order:");//ascending order
		
		for(int j =0;j<a;j++)
		{
			if (Array[j]%2==0) {
				System.out.println(Array[j]+" ");
						
				
			}
			
		
		}
}
}
