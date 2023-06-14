package Balaji;
import java.util.Scanner;
public class Roman_numerals {
//	I             1
//	V             5
//	X             10
//	L             50
//	C             100
//	D             500
//	M             1000
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roman_numerals R = new Roman_numerals();
		R.roman();
	}

	private void roman() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		int sum=0;
		
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
		switch (c) {
		case 'I' :
			sum=	sum+1;
			break;
		case 'V' :
			sum=sum+5;
			break;
		case 'X' :
			sum=sum+10;
			break;
		case 'L' :
			sum=sum+50;
			break;
		case 'C' :
			sum=sum+100;
			break;
		case 'D' :
			sum=sum+500;
			break;
		case 'M' :
			sum=sum+1000;
			break;
			
		
		}
		
		}
		System.out.println(sum);
	}

}
