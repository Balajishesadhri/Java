package Balaji;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class test2 {
	
	
		
	
              //main method
	public static void main(String[] args) {
		test2 eb=new test2();

		Scanner sc=new Scanner(System.in);
		System.out.println("EB Bill Calculation");
		System.out.println("-----------------");
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: "+date);
	    System.out.println("Month: "+ date.getMonth());
	    
		System.out.println("***********************************");
		System.out.println();
		eb.method1();
		

	}

	private void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type Option:1.Commercial\t 2.House\t3.Agriculture\t4.Huts");
		String select=sc.next();
		if(select.equalsIgnoreCase("commercial"))
			
		{
			commercial();
			
		}
		else if(select.equalsIgnoreCase("huts"))
		{
			System.out.println("Fixed charges for All: 	300/Service/month");
		}
		else if(select.equalsIgnoreCase("agriculture"))
		{
			System.out.println("Fixed charges for All: 3250/HP/Annum");
		}
			
		
		else if(select.equalsIgnoreCase("house"))
				{
			
				//Looping for Home Eb_Home
		for(int j=0;j<6;j++)
		{
			System.out.println("Options");
		System.out.println(" 1.Person-in_home\n 2.Door-locked\n 3.Meter-not-working\n 4.Cash-Depoist\n 5.Exit\n");
		System.out.println("Press the number for your options");
		
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter your previous month reading");
			int pre_reading=sc.nextInt();
			System.out.println("Enter your current month reading");
			int current_reading=sc.nextInt();
			
			int reading=current_reading-pre_reading;
			System.out.println("This month reading "+reading+" Units");
		  
			int freeunit=100;
			  System.out.println("free unit is "+freeunit);
			int payable=reading-freeunit;
			System.out.println("Payable reading is"+payable);
			//condition for Units 
			if(payable<=100)
			{
				int unit_value=0;
				
				System.out.println("No need to pay, below 100 unit is free");
			}
		
			else if(payable>=101 && payable<=200)
			{
			float per_unitvalue=2.25f;
			float total=payable*per_unitvalue;
			System.out.println("Reading "+payable+" Units "+" per_unit_amount "+per_unitvalue+" Rs");
			System.out.println("Amount have to paid for this month "+total+" Rs");
			}
			
			else if(payable>=201 && payable<=400)
			{
				float per_unitvalue=4.50f;
				float total=payable*per_unitvalue;
				System.out.println("Reading "+payable+" Units "+" per_unit_amount "+per_unitvalue+" Rs");
				System.out.println("Amount have to paid for this month "+total+" Rs");
			}
			else if(payable>=401 && payable<=500)
			{
				int per_unitvalue=6;
				int total=payable*per_unitvalue;
				System.out.println("Reading "+payable+" Units "+" per_unit_amount "+per_unitvalue+" Rs");
				System.out.println("Amount have to paid for this month "+total+" Rs");
			}
			else if(payable>=501 && payable<=600)
			{
				int per_unitvalue=8;
				int total=payable*per_unitvalue;
				System.out.println("Reading "+payable+" Units "+" per_unit_amount "+per_unitvalue+" Rs");
				System.out.println("Amount have to paid for this month "+total+" Rs");
			}
			else if(payable>=601 && payable<=800)
			{
				int per_unitvalue=9;
				int total=payable*per_unitvalue;
				System.out.println("Reading "+payable+" Units "+" per_unit_amount "+per_unitvalue+" Rs");
				System.out.println("Amount have to paid for this month "+total+" Rs");
			}
			else if(payable>=801 && payable<=1000)
			{
				int per_unitvalue=10;
				int total=payable*per_unitvalue;
				System.out.println("Reading "+payable+" Units "+" per_unit_amount "+per_unitvalue+" Rs");
				System.out.println("Amount have to paid for this month "+total+" Rs");
			}
			else if(payable>=1001)
			{
				int per_unitvalue=11;
				int total=payable*per_unitvalue;
				System.out.println("Reading "+payable+" Units "+" per_unit_amount "+per_unitvalue+" Rs");
				System.out.println("Amount have to paid for this month "+total+" Rs");
			}
			
			
			System.out.println("--------------------------------------");
			break;
		case 2:
			System.out.println("Enter your previous month EB-bill amount");
			int prebill=sc.nextInt();
			System.out.println("Your payable amount for this month: "+prebill+"Rs");
			System.out.println("--------------------------------------");
			break;
			
		case 3:
			System.out.println("Enter your last 6 month bill-amount");
			int[] cc=new int[6];
			int max=0;
for(int i=0;i<cc.length;i++)
			{
				cc[i]=sc.nextInt();
				if(cc[i]>max)
				{
					max=cc[i];
				}
				
			}
System.out.println("You have to pay "+max +" rs for this month");
			
			System.out.println("--------------------------------------");
			
			break;
		case 4:
			System.out.println("Enter your past 6 month paid amount");
			int[] ccc=new int[6];
			int total=0;
			for(int i=0;i<ccc.length;i++)
			{
				ccc[i]=sc.nextInt();
				total=total+ccc[i];
			}
			System.out.println("Total Eb-bill amount for last year "+total+" Rs");
			int value=total/12;
			int deposit_value=value*3;
			System.out.println("Your deposit value for this year "+deposit_value+" Rs");
			System.out.println("--------------------------------------");
			break;
		case 5:
		       
			System.out.println("You are exited");
			System.out.println("Thank you!");
			j=6;
			    break;
		}
		}
				}
		
		}
		private void commercial() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to commercial Tarif");
			System.out.println("Enter the Unit");
			int unit=sc.nextInt();
			
			if(unit>=0 && unit<=50)
			{
				int per_unitvalue=6;
				System.out.println("Fixed charges: 100/kW/Month");
			}
				else if(unit>=51 && unit<=112)
				{
					float per_unitvalue=9.5f;
					System.out.println("Fixed charges: 300/kW/Month");
				}
				else if(unit>=112)
				{
					float per_unitvalue=9.5f;
					System.out.println("Fixed charges: 550/kW/Month");	
				}
		
			
		}
			
		
	    
		
}



