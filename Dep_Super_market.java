package Balaji;

public class Dep_Super_market {
	Dep_Super_market(String product ,int price){
		super();
		this.product=product;
		this.price=price;
		
	}
     String product ;
	int price;
	public String toString(){
		return this.product+" "+this.price;
		
	}
}
