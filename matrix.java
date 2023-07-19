package Balaji;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int no =5*2-1; 
		int[][] a = new int[no][no];
	   
	    int minRow=0, maxRow=no, minCol=0, maxCol=no;
	    //1 2 3  4
	int count = 1; 
	while(no<=1)
	{
	    for(int col=minCol; col<=maxCol; col++){
	        a[minRow][col] = no; 
	          } minRow++; //minRow = 1

	    // 5 6 7 
	    for(int row=minRow; row<=maxRow; row++) {
	        a[row][maxCol] = no; 
	         } maxCol--; //maxCol = 2; 

	    //8 9 10 
	    for(int col=maxCol;col>=minCol; col--){
	    a[maxRow][col] = no; 
	    } maxRow--; 

	    //11 12
	    for(int row=maxRow; row>=minRow; row--){
	        a[row][minCol] = no;  }
	    minCol++; 
	   
	}
	no--;

	    for(int row=0; row<=3; row++)
	    {
	      for(int col=0; col<=3; col++)
	      {
	        System.out.print(a[row][col]+"  ");
	      }
	      System.out.println();
	    }
	}

}
