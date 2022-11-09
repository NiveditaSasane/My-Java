/*
 * write a program sort Array List
 *   Name : Nivedita sasane
     date : 01/11/2022.
 */


package Arraylist_Descending;
import java.util.*;
public class Array_List_Descending {

	public static void main(String[] args) {
		
		ArrayList<Integer>obj= new ArrayList<>();
		
		obj.add(88);
		obj.add(54);
		obj.add(66);
		obj.add(55);
		obj.add(35);
		obj.add(33);
		obj.add(20);
		obj.add(11);
		obj.add(100);
		
		System.out.println("ArrayList is :" + obj);
		//
		Collections.sort(obj,Collections.reverseOrder());
		System.out.println("Descending order is : " +obj);
		
		

	}

}
