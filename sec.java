package Balaji;
 import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 /* Yogesh Balaji - Ajitha - Daisvalin Subak

 Prabakaran - Priyanka - Thiyagu 

 SabariBala, - Basima - Praveen Kumar  

 Balaji - Amalraj - Penasir
  
 Ibrahim - Sangeetha - Arunkumar

 Sivaramakrishnan - Jayasurya - Mugilan 

 Venkatesan - Ashwini - Stalin Sagayaraj - Anjal */
 
public class sec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random r= new Random();
		String [] one ={ "Yogesh " , "Ajitha" ,"Daisvalin Subak","Prabakaran" , "Priyanka" , "Thiyagu"," SabariBala " };
		String[] two = {"Basima" , "Praveen Kumar", "Balaji" , "Amalraj" , "Penasir", "Ibrahim" , "Sangeetha "};
		String[] three = {"Arunkumar","Sivaramakrishnan" , "Jayasurya" ," Mugilan" ,"Venkatesan", "Ashwini" , "Stalin Sagayaraj"};
		String four[]= {"Anjal","0","0","0","0","0","0"};
	//	System.out.println(one[R.nextInt(one.length)]+" - "+two[R.nextInt(two.length)]+" - "+three[R.nextInt(three.length)]+" - "+four[R.nextInt(four.length)]);
	
	
		for(int i =0 ;i<=one.length;) {
			for(int j =0; j<=two.length;) {
				for(int n=0;j<=three.length;n++) {
					
					if(one[i]!=two[j] && two[j]!= three[n] && three[n]!= one[i]) {
						System.out.println(one[i]+"-"+ two[j]+"-"+three[n]);
						i++;
						j++;
					}
		}
		
	}
	

	}
	}
}

