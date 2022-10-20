/*
Question : Descending order in array.
Name : Nivedita sasane.
date : 20/10/2022.



package decending_array;

//import java.util.Arrays;

import java.util.*;

public class Decending_array {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of element in array ");
		
		int a = sc.nextInt();
		//int array[]=new int[a];
		Integer Array[]=new Integer [a];
		
		System.out.println("enter the elements ");
		
		for(int i =0;i<a;i++)
		{
			Array[i]=sc.nextInt();
			
		}
		System.out.println("Original array"+Arrays.toString(Array));
		
		
		
		Arrays.sort(Array,Collections.reverseOrder());
		System.out.println("Sorted array is"+Arrays.toString(Array));
	}
		

}
