/*
   Write a program  to Iterate ArrayList. 
   Name : Nivedita sasane
   date : 01/11/2022.
 */


package Iterate_Arraylist;
import java.util.*;
public class Iterate_Array_List {
public static void main(String[] args) {
		
		ArrayList<Integer>obj= new ArrayList<>();
		//
		
		obj.add(88);
		obj.add(77);
		obj.add(66);
		
		System.out.println("ArrayList is :" + obj);
		//
		
		Iterator<Integer>obj1 = obj.iterator();
		
		
		System.out.println("Arraylis using Iterator : ");
		while (obj1.hasNext())
		{
            System.out.print(obj1.next());
			 
			 System.out.print(",");
		 }
		}
			
		
		
		
	}



