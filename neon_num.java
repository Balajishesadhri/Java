package Balaji;

public class neon_num {
	public static void main(String [] args) {
		
		neon_num n = new neon_num();
		int num=51;
	int sum=	n.sum(num);
	int sq=	n.mul(9,2);
		if(num==sq) {
			System.out.print("neon num");
			
			
		}else {
			System.out.print("not neon num");
		}
	}

	 int sum(int num) {
		 int sum=0;
		while(num>0) {
			int j= num%10;
			sum=sum+j;
			num=num/10;
		}
		return sum;
		
	}
	 int mul(int base,int power) {
		 int i=1;
		 while(power>0) {
			 i=i*base;
			 power--;
			 
			 
		 }
		return i;
		 
		 
		 
	 }
	 
}
