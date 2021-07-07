package hit.day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GenericsRevision {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(10);
		list.add("Sheik");
		list.add("Nithish");
		list.add("Surya");
		list.add("prabhu");
		list.add("Arun");
		list.add("Mohan");
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.contains("Mohan"));
		System.out.println(list.indexOf("Surya"));
		System.out.println(list.isEmpty());
		Collections.sort(list);
		System.out.println(list);
		Iterator<String>iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		ListIterator<String> listiter=list.listIterator();
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.set(1, "Abba"));
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
