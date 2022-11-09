/*
 * write a program to change priorityqueue to maximum priority queue
 * name : Nivedita sasane
 * date : 3/11/2022
 */



package Queue;
import java.util.*;
class Queue_max {

	public static void main(String[] args) {
		Queue<Integer> obj = new PriorityQueue(Collections.reverseOrder());
		

		obj.add(101);
		obj.add(102);
		obj.add(103);
		obj.add(109);
		obj.add(108);
		obj.add(107);
		obj.add(202);
		obj.add(204);
		obj.add(208);
		obj.add(301);
		obj.add(302);
		obj.add(303);	
		obj.add(401);
		obj.add(407);
		obj.add(608);
		obj.add(909);
		obj.add(409);
		obj.add(808);
		
	
		
		System.out.println("ArrayList of first obj :" + obj);
		
		Integer val = null;
		
		while((val = obj.poll()) != null)
		{
			System.out.println(val +" ");
			
		}
		System.out.println("");
		
		
		
		
	}

}
