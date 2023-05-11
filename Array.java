package Balaji;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Array a= new Array();
		
		int j[]=a.sep();
		 for(int i=0 ;i<=j.length-1;i++) {
		//	 System.out.println(j[i]);
			 a.find(j[i]);
	}
		
	}
	  void find(int j) {
		int n=j%10;
		int i =j/10;
		if(n>=i) {
			System.out.println(j);
		}
	}

	int[] sep() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("how many subject");
		 int count=sc.nextInt();
		 
		 int[] arr= new int[count];
		 for(int i=0 ;i<=arr.length-1;i++) {
			 arr[i]=sc.nextInt();
				
		 }
		 //System.out.println(arr[0]); 
		 
		return arr;
 
	}

}
