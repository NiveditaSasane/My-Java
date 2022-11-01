/*
 * Linked Hashset is an ordered and sorted collection
 * and it maintain the insertion order of the element
 */


package LinkHashset_Example;
import java.util.*;
class Link_Hashset {

	public static void main(String[] args) {
		LinkedHashSet<String> obj1 =new LinkedHashSet<>();
		//
		
		obj1.add("Nive");
		obj1.add("moni");
		obj1.add("swap");
		
		System.out.println("LinkedHashSet is :" + obj1);
		//
		
		Iterator<String>obj2 = obj1.iterator();
		 System.out.println("LinkedHashSet using Iterator :");
		 while(obj2.hasNext())
		 {
			 System.out.print(obj2.next());
			 
			 System.out.print(",");
		 }
		
		
	}

}
