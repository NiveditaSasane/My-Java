package Nivedita;

import java.util.Scanner;

public class Reverse {
	 public static void main (String... args)
	 {
		{
			Scanner sc = new Scanner(System.in);// Taking input from user
			System.out.print("Type a Sentence Or a Words : ");
			String a = sc.nextLine();
			char[] b= a.toCharArray();
			for(int i=b.length-1;i>=0;i--)// for loop for showing reverse output 
			{
				System.out.print(b[i]+",");
			}		}
	}
	}
	
