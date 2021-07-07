package hit.day28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Tree Set Follows the Sequence of Sorting;Its is the Only Difference From Hash Set;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<>();
		set.add(20);
		set.add(13);
		set.add(3);
		set.add(30);
		set.add(10);
		set.add(15);
		for(Integer i:set) {
			System.out.println(i);
		}
		System.out.println(set);
//		set.clear();
//		System.out.println(set);
		Iterator<Integer> iter=set.iterator();
        while(iter.hasNext()) {
        	System.out.println(iter.next());
        }
        
   
		
	}

}
