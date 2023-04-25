package Balaji;

public class Armstrong_num {
public static void main(String [] args) {
	
	Armstrong_num a = new Armstrong_num();
	int no=153;
	int count=a.count(no);
	int result= a.spilt(no,count);
//System.out.print(result);
if(result==no) {
	System.out.print("armstrong");
	
}else {
	System.out.print("not armstrong");
}
}
	
	
int count(int no) {
	int c=0;
	while(no>0) {
		c++;
	no=no/10;
	}
	return c;

}
int spilt(int no,int count) {
	int sum=0;
	while(no>0) {
		int rem=no%10;
	sum=sum+find_square(rem,count);
		
		no=no/10;
		
	}
	return sum;
	

}
int find_square(int num,int count) {
	int mul=1;
	while(count>0) {
		mul=mul*num;
		count--;
		
	}
	return mul;
	
	
	
}

}

































