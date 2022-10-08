package INTERFACE;
import java.util.Scanner;
//public interface Square_Main {
	public class Square_Main {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the radius : ");
		
			int a = sc.nextInt();
			//double pi = 3.14;
			
			Square s = new Square();
			s.getArea(a);
			
			
		}
}
