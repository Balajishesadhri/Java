package Balaji;

public class armstrong2 {
	public static void main(String [] args) {
		
		armstrong2 a = new armstrong2();
		int no=153;
		String s=String.valueOf(no);
		
		int result= a.spilt(no,s.length());
	System.out.println(result);
	if(result==no) {
		System.out.print("armstrong");
		
	}else {
		System.out.print("not armstrong");
	}
	}
		
	int spilt(int no,int count) {
		int sum=0;
		while(no>0) {
			int rem=no%10;
		sum=(int) (sum+Math.pow(rem, count));
			
			no=no/10;
			
		}
		return sum;
		

	}
	


}
