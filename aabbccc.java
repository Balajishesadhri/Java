package Balaji;

import java.util.Arrays;

public class aabbccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="aaabbccc";
		char c[]=s.toCharArray() ;
		
		for(int i=0;i<s.length();i++) {
			int count =1;
			         //1
			for(int j=i+1;j<s.length();j++) {
				
			if(c[i]==c[j]) {
				count++;
				i++;
}      
}
			System.out.print(c[i]+""+count);
			
			
		}
	
		
		
		
	}
}