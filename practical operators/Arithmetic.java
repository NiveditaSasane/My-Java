package operator;
import java.util.Scanner;

class Arithmetic {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int i = sc.nextInt();
		
		System.out.println("Enter the 2nd Number: ");
		int j = sc.nextInt();
		
		sc.close();
		//writing operation
		int add, sub,mul,mod;
		double div;
		add = i+j;
		sub = i-j;
		mul = i*j;
		div = i/j;
		mod = i%j;
		//printing values
		System.out.println("Addition: " + add);
		System.out.println("Subtraction: " + sub);
		System.out.println("Multiplication: " + mul);
		System.out.println("Division: " + div);
		System.out.println("Modulus: " + mod);

	}

}
