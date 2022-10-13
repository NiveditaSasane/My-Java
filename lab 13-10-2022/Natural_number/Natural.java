/*
 print sum of 10 natural number using while loop.
   name : nivedita sasane 
  date : 13/10/2022.
 */
package Natural_number;
import java.util.Scanner;
public class Natural {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);	//user defined
		
		int num = 0;//take integer
		int x;
		int y=1;
		while(y<=10)//using while loop.
		{
			System.out.print("enter number:");
			x = sc.nextInt();
			if(x<=0) {
				
			}else {
			
				num=num+x;
			}
			y++;
		}
		System.out.println();
		System.out.println("sum of natural number is");
		System.out.println(num);
	
	}}
