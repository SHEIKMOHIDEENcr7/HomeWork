package hit.day30;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.put("412519205123", "Sheik");
		prop.put("412519205095","Nithish");
		prop.put("412519205111", "prabhu");
		System.out.println(prop.get("412519205123"));
		
		System.out.println("By Enumertion: ");
		Enumeration<Object> en=prop.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println("By Iterator: ");
		Set set=prop.entrySet();
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}

}
