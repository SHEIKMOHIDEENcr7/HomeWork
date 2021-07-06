package hit.day27;

import java.util.ArrayList;
import java.util.List;

public class CollectionGenerics {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("Sheik");
		list.add("MOHIDEEN");
		list.add("Nithish");
		//list.add(new Box());
		
//		for(Object o:list) {
//			if(o instanceof String) {
//				System.out.println(o);
//			}
//			else if(o instanceof Box) {
//				System.out.println(o);
//			}
		//}
		for(Object o:list) {
			String s=(String)o;
			System.out.println(s);
		}
		
	}

}
class Box{
	public void met() {
		System.out.println("ABBA");
	}
}