package hit.day26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		String s[]= new String[5];
		s[0]="Hello";
		s[4]="Bye";
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		for(String str:s) {
			System.out.println(str);
		}
		
		List list=new ArrayList();
		list.add("Sheik");
		list.add("Mohideen");
		list.add(7);
		list.add("Nithish");
		list.add(new Sample());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(Object o:list) {
			System.out.println(o);
		}
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		ListIterator listiter=list.listIterator();
		
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
	}

}
class Sample{
	public void met() {
		System.out.println("Im from Sample Class");
	}
}
