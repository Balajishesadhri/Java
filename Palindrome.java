package Balaji;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		int num =121;
	int check=	p.Palindrome(num);
	
	if(check==num) {
		System.out.print("Palindrome");
		
	}else {
		System.out.print("not Palindrome");
	}
	}
	int Palindrome(int num) {
		int i=0;
		int sum=0;
		while(num>0) {
			i=num%10;
			sum=(sum*10)+i;
			num=num/10;
			
		}
		return sum;
		
	}

}
