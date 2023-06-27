package Balaji;

import java.util.Arrays;
import java.util.Scanner;

public class aabbccc {

	public static void main(String[] args) {
		

		
	        Scanner io=new Scanner(System.in);
	        String str=io.nextLine();
	        char[] input=str.toCharArray();
	        int n=input.length;
	        for(int i=0;i<n;i++)
	        {
	            if(input[i]==' ') {
	            	 continue;
	 	            
	            }
	            int c=1;
	            for(int j=i+1;j<n;j++)
	            {
	                if(input[i]==input[j])
	                {
	                    c++;
	                    input[j]=' ';
	                }
	            }
	            System.out.print(input[i]+"="+c+" ");
	        }
	    }
}