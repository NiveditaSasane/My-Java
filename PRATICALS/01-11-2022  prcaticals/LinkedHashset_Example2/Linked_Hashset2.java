/*
 * Cresting LinkedHashSet from ArrayList
 */

package LinkedHashset_Example2;
import java.util.*;
class Linked_Hashset2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>obj= new ArrayList<>();
		//
		
		obj.add(88);
		obj.add(77);
		obj.add(66);
		
		System.out.println("ArrayList is :" + obj);
		//
		
		
		
		LinkedHashSet<Integer> obj1 =new LinkedHashSet<>(obj);
		
		System.out.println("LinkedHashSet is: " + obj);
		
		
		
	}

}
