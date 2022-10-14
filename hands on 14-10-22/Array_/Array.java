/*
 WAP a program for array
 Name = nivedita sasane 
 date = 14/10/22
 */
package Array_;
import java.util.Scanner;
public class Array {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int b=input.nextInt();
		
		int a[]=new int[b];
		for(int i=0;i<a.length;i++) {
			
	
	
		System.out.print("enter "+i+"number of the array: ");
		int x=input.nextInt();
		
		a[i]=x;
		}	
		System.out.print("Array is[ ");
		for(int j=0;j<a.length;j++) {
			 
			if(j==(b-1)) {
				System.out.print(a[j]+"  ");
			}else {
				System.out.print(a[j]+" ");
				
				
			}
			 
		}
		 System.out.print(" ]");
	}

}
