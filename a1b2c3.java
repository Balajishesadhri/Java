package Balaji;

public class a1b2c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a2b3c7";
		 for(int i =0;i<s.length();i++) {
			 
			if(Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
				
			 }else {
				 int x=Character.getNumericValue(s.charAt(i));
				 if(x==Character.getNumericValue(s.charAt(i-1))) {
					String  s1 =Character.toString(s.charAt(i))+Character.toString(s.charAt(i-1));
					int n=Integer.parseInt(s1);
				//	System.out.print(n);
					for(int l =0;l<n;l++) {
						System.out.print(s.charAt(i-2));
					}
					
					
				 }
				for(int j=0;j<x-1;j++) {
					System.out.print(s.charAt(i-1));
				}
			 }
		 }
		

	}

}
