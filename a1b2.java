package Balaji;

public class a1b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a2b2c3d3";
		int count =0;
		char c[]=s.toCharArray();
				for(int i =0;i<s.length();i++) {
					if(i%2==1) {
						count=(char) ((int )c[i]-48);
						String s1= String.valueOf(c[i-1]);
						for(int j=0;j<count;j++) {
							System.out.print(s1);
							
						}
					}
				}

	}

}
