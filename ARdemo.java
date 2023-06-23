package Balaji;

import java.util.ArrayList;
import java.util.Collections;

public class ARdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m1 = new Mobile(10000, 4, 6.5f, "Samsung");
		Mobile m2 = new Mobile(8000, 2, 4.5f, "Oppo");
		Mobile m3 = new Mobile(12000, 4, 5f, "Vivo");
		Mobile m4 = new Mobile(9000, 6, 6f, "Apple");
		ArrayList al = new ArrayList(); 
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
     	Collections.sort(al);
		System.out.println(al);
	}

}
