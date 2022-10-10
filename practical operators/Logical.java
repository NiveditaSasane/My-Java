package operator;
import java.util.Scanner;
class Logical {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 1st number: ");
	    int num1 = sc.nextInt();
	    
	    System.out.print("Enter 2st number: ");
	    int num2 = sc.nextInt();
	 
	    System.out.print("Enter 3rd number: ");
	    int num3 = sc.nextInt();
	    
	    System.out.println("Performing AND Operator: ");
	    //using logical AND to verify 2 constraint.
	    
	    if ((num1<num2)&&(num2==num3))
	    {
	    	int sum = num1+num2+num3;
	    	System.out.println("sum is:"+sum);
	    }
	    else
	    {
	    	System.out.println("False Condition.");
	    	
	    }
	    System.out.println("performing OR operation");
	      //using logical OR to verify 2 constraints.
	    if ((num1<num2)||(num2==num3))
	    {
	    	int sum = num1+num2+num3;
	    	System.out.println("sum is:"+sum);
	    }
	    else
	    {
             System.out.println("False Condition.");
	    	
	    }
	    System.out.println("performing NOT operation");
	    	// using logical NOT to verify 2 constraints.
	    
	    System.out.println("!(num1<num2)" + !(num1<num2));
	    
        
	    
	 
	
	
	
	
	
	}

}
