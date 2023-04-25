package Balaji;

public class a1b4c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a1b2c3d4";
		char c[]=s.toCharArray();
		for(int i =0;i<s.length();i++) {
			if(i%2==1) {
				String s2 = String.valueOf(c[i-1]);
				String s1=String.valueOf(c[i]);
				int n= Integer.parseInt(s1);
				for(int j=0;j<n;j++) {
					System.out.print(s2);
				}
			}
		}

	}

}
