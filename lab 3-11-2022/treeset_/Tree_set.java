/*
 * write a program to get the element in a tree set which is strictly greater than or equal to the given element
 * name : Nivedita sasane
 * date : 3/11/2022
 */

package treeset_;
import java.util.*;
class Tree_set {

	public static void main(String[] args) {
		
		TreeSet<String> obj = new TreeSet();
		
		obj.add("lotus");
		obj.add("lily");
		obj.add("mogra");
		obj.add("rose");
		obj.add("sun flower");
		
		System.out.println("ArrayList of first obj :" + obj);
		
		String a = "z";
		System.out.println(obj.ceiling(a));
		
		

	}

}
