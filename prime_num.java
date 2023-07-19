package Interview;

import java.util.Scanner;

public class prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		boolean b=false;
		for(int i=2;i<n;i++) {
			if(n%i!=0) {
				b=true;
			}else {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
	}

}
