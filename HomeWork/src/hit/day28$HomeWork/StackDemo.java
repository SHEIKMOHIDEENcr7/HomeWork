package hit.day28$HomeWork;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


public class StackDemo {
	public static void main(String[] args) {
		Vector<String> stack= new Stack<String>();
		stack.add("tomato");
		stack.add("brinjal");
		stack.add("beetroot");
		stack.add("onion");
		stack.add("califlower");
		Collections.sort(stack);
		System.out.println(stack);
		stack.add(1, "garlic");
		System.out.println(stack);
		stack.set(1, "ginger");
		System.out.println(stack);
		System.out.println(stack.firstElement());

		for(String s:stack) {
			System.out.println(s);
		}
		stack.addAll(stack);
		System.out.println(stack);
		stack.clone();
		System.out.println(stack);
		System.out.println(stack.contains("ginger"));
		System.out.println(stack.containsAll(stack));
		System.out.println(stack.get(1));
		System.out.println(" ");
		System.out.println("After Using Iterator: ");
		System.out.println(" ");
		Iterator<String> iter=stack.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(" ");
		System.out.println("After Using ListIterator: ");
		ListIterator<String> listiter=stack.listIterator();
		
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
		System.out.println(" ");
		System.out.println("After Using Enumeration: ");
		Enumeration<String> en= stack.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println(stack);
		
		
		
		
	}

}
