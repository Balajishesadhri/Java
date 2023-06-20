package oops_learning;

public class Gpay {

	private int pwd=1234;
private	void pay() {
		System.out.println("Paying through gpay");
	}
public static void main(String[] args) {
	Gpay gpay2 = new Gpay();
	gpay2.pay();
System.out.println(gpay2.pwd);	
}
	}


