package hit.day25;

import java.util.StringJoiner;

public class GarbageCollection {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("free memory: "+r.freeMemory());
		Grandmaster gm=new Grandmaster();
		System.out.println("After the Free Memory: "+r.freeMemory());
		
		String s="Hello";
		String temp=s;
		String s1=s+"World";
		System.out.println(s1);
		System.out.println(temp);
		
		StringBuffer sb=new StringBuffer("Sheik");
		sb.append("Mohideen");
		System.out.println(sb);
	}

}
class Grandmaster{
	StringBuilder sb=new StringBuilder("Hello");
	//StringJoiner sj=new StringJoiner("Hello");
	//String s;
	public Grandmaster() {
		for(int i=0;i<10000;i++) {
			//sj.add("World");
			//s=new String("Hello");
			sb.append("World");
			
		}
		
	}
}
