package oops_learning;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child  c = new Child();
       c.receive();
       // Dynamic binding parent class refference la child class memory use pandrom
       Parent p = new Child();
      p.cook();
       c.cook();
       c.java_developer();
    System.out.println(c.balance);   
       
	}
	public void java_developer() {
		// TODO Auto-generated method stub
		System.out.println("Java developer");
	}
	public void receive() {
		System.out.println("Tacking care of relivives and frds");
	}

}
