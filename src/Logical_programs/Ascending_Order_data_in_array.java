package Logical_programs;

import java.util.Arrays;

public class Ascending_Order_data_in_array {
	public static void main(String[] args) {
		int ar[]= {90,45,60,20,30,10};
		//print entire data
		//for(int i=0;i<=ar.length-1;i++) {
			//System.out.println(ar[i]);
			//print data in Ascending order
			Arrays.sort(ar);
			for(int i=0;i<=ar.length-1;i++) {
				System.out.println(ar[i]);
			}
	}
}
