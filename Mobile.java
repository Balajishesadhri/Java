package Balaji;

public class Mobile implements Comparable {
	public Mobile(int price, int ram, float screensize, String brand) {
	    super();
	    this.price = price;
	    this.ram = ram;
	    this.screensize = screensize;
	    this.brand = brand;
	  }
	  int price, ram; 
	  float screensize; 
	  String brand;
	  public String toString() {
		  return this.brand+" "+this.price;
	  }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Mobile mob2 =(Mobile)this;
		Mobile mob1=(Mobile)o;
         	
		
//		if(mob1.price>mob1.price) {
//			return 123;
//		}else if(mob1.price>mob2.price){
//			return -178;
//		}
		  String s2 = mob2.brand;
		    String s1 = mob1.brand; 
		    int result = s2.compareTo(s1);
		    if(result>0)
		      return +11; 
		    else if(result<0)
		      return -98;
		return 0;
	}
}
 