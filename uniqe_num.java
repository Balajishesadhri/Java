package Balaji;

public class uniqe_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] a= {1,2,3,4,1,2,5};
		 
		int count =0;
		int sum =0;
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
					a[j]=-1;
					a[i]=-1;
					
				}
				
				
					
				}
			if(!(a[i]==-1)) {
				sum+=a[i];
			
			}
		
		
		
		}
		System.out.print(sum);
		
	}

}
