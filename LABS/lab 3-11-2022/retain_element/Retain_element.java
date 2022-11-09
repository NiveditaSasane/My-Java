/*
 * write a program to compare two sets and retain element which are same on both sets
 */




package retain_element;
import java.util.*;
class Retain_element {

	public static void main(String[] args) {
		ArrayList<Integer>obj =new ArrayList();
		
		obj.add(101);
		obj.add(102);
		obj.add(103);
		
		System.out.println("ArrayList of first obj :" + obj);
		
		ArrayList<Integer>obj1 =new ArrayList();
		
		obj1.add(108);
		obj1.add(102);
		obj1.add(105);
		
		System.out.println("ArrayList of first obj2 :" + obj1);
		
		obj.retainAll(obj1);
		
		System.out.println("after retain:");
		 
		System.out.println("retain element" + obj);
		
	}

}
