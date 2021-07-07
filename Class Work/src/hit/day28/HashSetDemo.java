package hit.day28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Hash set doen't not allow the duplicate value;
//it does not follow the sequence of sorting;
//we can use iterator in hash set as well but not list iterator and enumeration
//if we use more number we would be use Set instead of ArrayList;
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Mango");
		set.add("Pineapple");
		set.add("Butterscotch");
		set.add("Apple");
		set.add("JackFruit");
		System.out.println(set);
		for(String s:set) {
			System.out.println(s);
		}
		set.add("Papaya");
		System.out.println(set);
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
