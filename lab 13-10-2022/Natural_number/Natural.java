package Natural_number;
import java.util.Scanner;
public class Natural {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);	
		
		int num = 0;
		int x;
		int y=1;
		while(y<=10)
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