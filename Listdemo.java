package Balaji;

import java.util.ArrayList;
import java.util.Scanner;

public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList grocery   =new ArrayList();
		grocery.add("shampoo");
		grocery.add("soap");
		grocery.add("toothpaste");
		grocery.add("toothbrush");
	//	System.out.println(grocery);
		ArrayList veg   =new ArrayList();
		veg.add("tomato");
		veg.add("apple");
		veg.add("banana");
		veg.add("tomato");
	//	System.out.println(veg);
		grocery.addAll(veg);
		System.out.println(grocery.contains("tomato"));
		 ArrayList marks   =new ArrayList();
		 Scanner sc = new Scanner(System.in); 
		int i=0;
		int total=0;
		    while(true)
		    {
		      System.out.println("Enter mark: ");
		    int mark = sc.nextInt(); 
		    marks.add(mark); 
	 total=	total+(int) marks.get(i);
	 i++;
		    System.out.println("enter stop"); 
		  //  char ch = sc.next().charAt(0); 
		   // if(ch =='N')
		    String s=sc.next();
		    if(s.equalsIgnoreCase("Stop")) {
		        break; 
		    }
		    }
		   
		    System.out.print(total);
	}
}
