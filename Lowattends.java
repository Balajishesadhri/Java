package Balaji;

public class Lowattends extends RuntimeException{


	public Lowattends(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("String");
	}

	public Lowattends() {
		// TODO Auto-generated constructor stub
	}

	public void allowforExam(int  attendance) {
		
		if(attendance>=75) {
			System.out.println("Permit Student");
		}
		else {
			 throw  new Lowattends("loe att"); // anonymous object
		}
		
	}
}
