package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Largest_num {
	public static void main(String[] args) {
		
		int n[] = { 54, 546, 548, 60 };
		
		int n1 []=largestValue(n);
		
		for(int i=0;i<n1.length;i++) {
		System.out.print(n1[i]);
		}
			}
	public static int[] largestValue(int[] arr) {
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = 0 ; j < arr.length-i-1 ; j++) {
			int xy = Integer.parseInt(arr[j] + "" + arr[j+1]);
			int yx = Integer.parseInt(arr[j+1] + "" + arr[j]);
			if(yx>xy) {
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			}
			}
			}
			return arr;
			}
		
}
