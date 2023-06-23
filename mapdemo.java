package Balaji;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap(); 
	    hm.put("Idli", 20);
	    hm.put("Dosai", 30);
	    hm.put("Poori", 30);
	    hm.put("Pongal", 40);
//	    System.out.println(hm);
//	    System.out.println(hm.keySet());\
//	    System.out.println(hm.values());
//	    System.out.println(hm.entrySet());
	    Set s = hm.entrySet();
	    for(Object o :s) {
	    Entry entry = (Entry) o;	
//	    int price =(int)entry.getValue();
//	    if(price ==40) {
//	    	   System.out.println(entry.getKey());
//	    }
	 String iteam =(String)entry.getKey();
	 if(iteam.equals("Pongal"))
		 System.out.println(entry.getValue());
	    }
	}

}
