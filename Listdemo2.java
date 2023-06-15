package Balaji;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Listdemo2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LinkedList al = new LinkedList(); 
//	    al.add(100);
//	    al.add(200);
//	    al.add("Hi");
//	    al.add(true);
//	    
//	    LinkedList al2 = new LinkedList(); 
//	    al2.add("Siva");
//	    al2.add("Stalin");
//	    al2.add("Anjali");
//	    al2.add("priyanka");
//	    
//	    al.addAll(al2);
//	    
//	    
//	System.out.println(al.contains("Stalin")); 
//	al.remove(0);
	
	
	
	
	
	ArrayList al = new ArrayList(); 
    al.add("priyanka");
    al.add("ashwini");
    al.add("balaji");
    al.add("jayasurya");
    System.out.println(al);
  //Class Cast Exception  
    Collections.sort(al);
  int result = Collections.binarySearch(al, "balaji");
    System.out.println(result);
    System.out.println(al);
	}

}
