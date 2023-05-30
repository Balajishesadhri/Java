package Balaji;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringDemo st = new StringDemo();
st.check_start();
	}
	private void check_start() {
	    // TODO Auto-generated method stub
	    String name1 = "sabaribala";
	    String name2 = "sab";
	    boolean starts = true; 
	for(int i=0; i<name2.length();i++)  {  
	    if(name1.charAt(i) == name2.charAt(i))
	    {
	      continue;
	    }
	    else
	    {
	      starts = false; 
	      break; 
	    }
	  }
	  if(starts==true)
	  {
	    System.out.println("yes " + name1 + " starts with "+name2);
	  }
	  else
	  {
	    System.out.println("Not starts with "+name2);
	  }
	}
}
