package hit.day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class LinkedListDemo {
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
		
		List<String> alist=new LinkedList<>();
		alist.add("Sheik");
		alist.add("Nithish");
		alist.add("Surya");
		alist.add("prabhu");
		alist.add("Arun");
		alist.add("Mohan");
		System.out.println(alist);
		System.out.println(alist.get(3));
		System.out.println(alist.contains("Mohan"));
		System.out.println(alist.indexOf("Surya"));
		System.out.println(alist.isEmpty());
		Collections.sort(alist);
		System.out.println(alist);
		Iterator<String>iter1=alist.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		ListIterator<String> listiter1=alist.listIterator();
		while(listiter1.hasNext()) {
			System.out.println(listiter1.next());
		}
		while(listiter1.hasPrevious()) {
			System.out.println(listiter1.previous());
		}
		System.out.println(alist);
		System.out.println(alist.size());
		System.out.println(alist.set(1, "Abba"));
		System.out.println(alist);
		for(String s:alist) {
			System.out.println(s);
		}
        System.out.println(list.equals(alist));		
	}

}
