package Balaji;

public class threademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		threadchild tc = new threadchild();
		
		   System.out.println(tc.getId()); 
		    System.out.println(tc.getName()); 
		    System.out.println(tc.getPriority());
		    System.out.println(tc.isDaemon());
		    System.out.println(tc.isAlive());
		    tc.setName("Balaji");
		    System.out.println(tc.getName()); 
		    tc.setPriority(10);
		    System.out.println(tc.getPriority());
		tc.start();
		

		for (int no = 1; no <= 5; no++) {

			System.out.println("Threademo " + no);
		}
	}

}
