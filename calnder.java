package Balaji;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;


public class calnder {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
	//	System.out.println ("start");
		String s= "2020-02-22";
	//	System.out.println ("end");
		String s1= "2025-01-24";
		
		LocalDate st = LocalDate.parse(s);
		LocalDate st1 = LocalDate.parse(s1);
		
	Period p = Period.between(st, st1);
	
	
	System.out.println ("Worked days company : "+p.getYears()+"-"+p.getMonths()+"-"+ p.getDays());	
		
		String s2= "2020-02-22";
		//	System.out.println ("end");                                                            4-11-2
		                                                                                      //   1-0-2
			String s3= "2022-02-24";
			
			LocalDate st2 = LocalDate.parse(s2);
			LocalDate st3 = LocalDate.parse(s3);
			if(st2.compareTo(st) < 0) {
				System.out.println("non occuption is not vaild");
				
			}
			else if(st.compareTo(st2)==0) {
				
				System.out.println("both dates are equal");
			}
			
			
		Period p1 = Period.between(st2, st3);
		System.out.println (" non company : "+p1.getYears()+"-"+p1.getMonths()+"-"+ p1.getDays());	

			
			 int i = p.getYears()-p1.getYears();
			 int j= p.getMonths()-p1.getMonths();
			 int n= p.getDays()-p1.getDays(); 
			 System.out.println (i+"-"+j+"-"+n); 
		
	}
}
