package Balaji;

import java.util.Scanner;

public class Maths {
	 static int add(int a, int b) {
		int adds= a+b;
		return adds;
	}

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);		
		Maths m= new Maths();
		System.out.println("enter to add number");
	int s=add(sc.nextInt(),sc.nextInt());
	
		System.out.print(s);
	}

}
