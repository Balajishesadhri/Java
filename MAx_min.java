package Interview;

public class MAx_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {54, 546, 548, 60};
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
			if(n[i]>n[j]) {
				int tepm=n[i];
				n[i]=n[j];
				n[j]=tepm;
				
			}
			
		}
		}
		
			System.out.print(n[0]+" "+n[n.length-1]);
		
	}

}
