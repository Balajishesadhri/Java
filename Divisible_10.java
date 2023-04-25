package Balaji;

public class Divisible_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible_10 d = new Divisible_10();


		d.divisible();



		}

		void divisible(){
		int no =10;
		int div=1;
		for(int i=0; i<=no;i++){
		if(no % div==0){

		System.out.println(div);
		
		
		}
		div =div+1;

		}
	}

}
