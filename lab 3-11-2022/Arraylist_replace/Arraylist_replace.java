/*
 *write a program to replace the second element of a arraylist with the specified element
 *name : Nivedita sasane
 *date : 3/11/2022. 
 */

package Arraylist_replace;
import java.util.*;
class Arraylist_replace {

	public static void main(String[] args) {
		
		ArrayList<Integer>obj= new ArrayList<>();
		
		obj.add(101);
		obj.add(102);
		obj.add(103);
	
		System.out.println("ArrayList is :" + obj);
		
		obj.set(2,104);
		// using replace()
		System.out.println("Replace arraylist" + obj);		
		
		
		
		
		
		

	}

}
