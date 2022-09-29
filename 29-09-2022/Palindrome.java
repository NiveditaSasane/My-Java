package stringcode;
	import java.util.Scanner;
	 
	class Palindrome {
	    public static void main(String[] args) {
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter a string as an input to check whether it is Palindrome or not");
	        String input= scanner.nextLine();
	        
	        if(isPalindrome(input))
	        {
	            System.out.println(input+" is a palindrome string");
	        }
	        else
	        {
	            System.out.println(input+" is not a palindrome string");
	        }
	    }
	 
	    public static boolean isPalindrome(String str) {
	        int left, right = str.length() - 1;
	        
	        while(left < right)
	        {
	            if(str.charAt(left) != str.charAt(right))
	            {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    } 

}