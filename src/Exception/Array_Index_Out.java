package Exception;

public class Array_Index_Out {
public static void main(String[] args) {
	String ar[]=new String[5];
	ar[0]="Anjali";
	ar[1]="Jyoti";
	ar[2]="Amar";
	ar[3]="Ayansh";
	ar[4]="Anvi";
	System.out.println(ar[4]);
	System.out.println(ar[1]);
	System.out.println(ar[5]);//if u r try to fetch index which is not there then we will get array index out of bond excepiton
}
}
