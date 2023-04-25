package Balaji;
/*1 6 10 13 15
 * 2 7 11 14
 * 3 8 12
 * 4 9
 * 5
 *  */

public class patten1_6_10_13_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int no=1;
         for(int i=5;i>=1;i--) {
        	 int no1=no;
        	 int no2=5;
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(no1+" ");
        		 no1=no1+no2;
        		 no2--;
        	 }
        	 no++;
        	 System.out.println();
         }
	}

}
