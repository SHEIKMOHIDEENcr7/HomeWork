package hit.day29;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyComparatorDemo {
	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<>(new MyComparator());
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
		Iterator<Integer> iter=set.iterator();
        while(iter.hasNext()) {
        	System.out.println(iter.next());
        }
        
       
      
		
	}

}
class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
}
