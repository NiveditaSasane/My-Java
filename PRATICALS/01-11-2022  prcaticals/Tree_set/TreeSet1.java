/*
 * Tree set class implements set interface that uses a tree for storage
 * it inherits abstract sets class an implements navigable set interface
 * the object of the tree set class are sorted in ascending order
 * it contains unique elements and does not allows null values 
 */

package Tree_set;
import java.util.*;
class TreeSet1 {
	public static void main(String[]args) {
		
		SortedSet<String> fruits = new TreeSet<>();
		
		fruits.add("Gava");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Cherry");
		
		System.out.println("fruits are : " + fruits);
		//
		
		fruits.add("Mango");
		System.out.println();
		System.out.println("after adding duplicate elements : " + fruits);
		
		
	}

}
