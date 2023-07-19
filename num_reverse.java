package Interview;

import java.util.Scanner;

public class num_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		String s="";
		while(n!=0) {
			int i=n%10;
			s=s+i;
			n=n/10;
			
		}
           int num =Integer.valueOf(s);
		System.out.print(num);
		
		
}
}
