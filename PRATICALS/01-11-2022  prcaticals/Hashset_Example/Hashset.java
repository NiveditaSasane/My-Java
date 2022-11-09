/* Hashset class implements the set inheritance,it uses hash table to store the elements and contains only unique elements.
 *
 */


package Hashset_Example;
import java.util.*;
class Hashset{


	public static void main(String...args) {
		HashSet<String> obj1 = new HashSet<>();
		//using add()
		
		obj1.add("Nive");
		obj1.add("moni");
		obj1.add("swap");
		
		System.out.println("Hashset  is" + obj1);
		//calling iterator()
		Iterator<String> obj2 = obj1.iterator();
		
		System.out.println("Hashset using iterator" + obj2);
		while(obj2.hasNext())
		//hashset() to check next value 
		{
			System.out.print(obj2.next());
			
			System.out.print(",");
		}
		

	}

}
