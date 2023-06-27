package Balaji;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Super_Market {
	static HashMap hm = new HashMap(); 
	
	static Scanner sc = new Scanner(System.in);
	
	Super_Market(){
	
	    hm.put("Soap",30);
	    hm.put("Rice", 50);
	    hm.put("Oil",175);
	    hm.put("Bread",26);
	    System.out.println(hm);
	    Set s = hm.entrySet();
	   
	}

	

	public static void main(String[] args) {
		Super_Market sm = new Super_Market();
		sm.chose();
		
	}



	private void chose() {
		// TODO Auto-generated method stub
		System.out.print("press 1 for Soap ");
		System.out.print("press 2 for Rice ");
		System.out.print("press 3 for Oil ");
		System.out.print("press 4 for Bread ");
		System.out.print("press 5 for Jam ");
		System.out.println();
		
		String sel =sc.next();
		 Set s = hm.entrySet();
		    for(Object o :s) {
		    Entry entry = (Entry) o;	
		    String iteam =(String)entry.getKey();
		  switch(sel) {
		  case"1":
			  if(iteam.equals("Soap")){
			add((int)entry.getValue(),(String)entry.getKey());
			  }break;
		  case"2":
			  if(iteam.equals("Rice")){
			  System.out.print(entry.getKey()+" "+entry.getValue());
			  }break;
		  case"3":
			  if(iteam.equals("Oil")){
			  System.out.print(entry.getKey()+" "+entry.getValue());
			  }break;
		  case"4":
			  if(iteam.equals("Bread")){
			  System.out.print(entry.getKey()+" "+entry.getValue());
			  }break;
			  
		  }
		    }
	}



	private void add(int i,String s) {
		// TODO Auto-generated method stub
		System.out.println("Enter Qnty");
		int Qnty =sc.nextInt();
		System.out.print(s+ " "+i*Qnty);
	}

}
