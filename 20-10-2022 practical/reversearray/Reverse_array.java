package reversearray;
import java.util.Scanner;
public class Reverse_array {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of element in array ");
		
		int a = sc.nextInt();
		int array[]=new int[a];
		int rev[]=new int [a];
		
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
