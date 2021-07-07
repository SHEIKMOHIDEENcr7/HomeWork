package hit.day28$HomeWork;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
      public static void main(String[] args) {
    	Queue<String> queue=new LinkedList<String>();
    	 queue.add("tomato");
  		queue.add("brinjal");
  		queue.add("beetroot");
  		queue.add("onion");
  		queue.add("califlower");
  		
  		System.out.println(queue);
  		

  		for(String s:queue) {
  			System.out.println(s);
  		}

  		System.out.println(queue.contains("ginger"));
  		System.out.println(queue.containsAll(queue));
  		
  		System.out.println(" ");
  		System.out.println("After Using Iterator: ");
  		System.out.println(" ");
  		Iterator<String> iter=queue.iterator();
  		while(iter.hasNext()) {
  			System.out.println(iter.next());
  		}
  	   queue.add("ginger");
  	   System.out.println(queue);

      }
}
