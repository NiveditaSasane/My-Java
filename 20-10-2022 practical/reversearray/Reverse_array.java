/*
Question : Reverse number in array.
Name : Nivedita sasane
date : 20/10/2022.

package reversearray;
import java.util.Scanner;
public class Reverse_array {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of element in array ");
		
		int a = sc.nextInt();
		int array[]=new int[a]; // array integer.
		int rev[]=new int [a]; // reverse integer.
		
		System.out.println("enter the elements ");
		
		for(int i =0;i<a;i++) {
			array[i]=sc.nextInt();
			
		}
		System.out.println("Reverse of array is  ");
		int j=0;
		for(int i =a;i>0;i--,j++) { 
			
			rev[j]=array[i-1];
			System.out.println(rev[j]);
			
		}
		
		
		
		
		
		}

}
