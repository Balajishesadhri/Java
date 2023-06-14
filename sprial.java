package Balaji;

public class sprial {
	public static void main(String[] args) {
	int[][] a = new int[4][4];
    int no =1; 
    int minRow=0, maxRow=3, minCol=0, maxCol=3;
    //1 2 3  4
int count = 1; 
while(no<=16)
{
    for(int col=minCol; col<=maxCol; col++){
        a[minRow][col] = no; 
        no++;  } minRow++; //minRow = 1

    // 5 6 7 
    for(int row=minRow; row<=maxRow; row++) {
        a[row][maxCol] = no; 
        no++; } maxCol--; //maxCol = 2; 

    //8 9 10 
    for(int col=maxCol;col>=minCol; col--){
    a[maxRow][col] = no; no++; 
    } maxRow--; 

    //11 12
    for(int row=maxRow; row>=minRow; row--){
        a[row][minCol] = no; no++; }
    minCol++; 
   
}

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
