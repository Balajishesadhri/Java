package Balaji;

import java.util.Scanner;

public class encrypted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char c;
		for(int i =0; i <=s.length()-1;i++) {
			
			c=s.charAt(i);
			if(c==' ') {
				
			}else {
				c=(char)((int)c+1);
			}
		String d=	Character.toString(c);
			for(int j= 0 ;j<=d.length()-1;j++) {
			 System.out.print(d.charAt(j));
			
			}
		}
		

	}

}
