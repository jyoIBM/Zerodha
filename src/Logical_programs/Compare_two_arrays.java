package Logical_programs;

import java.util.Arrays;

public class Compare_two_arrays {
	public static void main(String[] args) {
		int ar1[]= {10,20,30,40,50};
		int ar2[]= {50,30,20,55,60};
		int ar3[]= {10,20,30,40,50};
		System.out.println(Arrays.equals(ar1,ar2));//false
		System.out.println(Arrays.equals(ar2,ar3));//false
		System.out.println(Arrays.equals(ar1,ar3));//true
	}
}
