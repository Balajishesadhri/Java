package Balaji;

public class EBcalculator {
	static EBcalculator re = new EBcalculator();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int bill = re.calculator_units();
		
		System.out.println(bill+"one");
		
int amount= 500;
//int balance = amount- bill;
//System.out.println(balance);
re.pay(amount, bill);

	}

    void pay(int amount, int bill) {
    	
		System.out.println(amount-bill+"two");
	   
	
		
		
	}

int calculator_units() {
		// TODO Auto-generated method stub;
		int unit= 150;
		int price=2;
		System.out.println(unit*price+"three");
		return unit*price;
	//	System.out.println(unit*price);
		
	}
	

}
