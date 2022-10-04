package strings_methods;

public class Reverse_String {
public static void main(String[] args) {
	String amr="AMAR";
	String rev="";	
	for(int i=amr.length()-1;i>=0;i--) {
		rev=rev+amr.charAt(i);
	}
	System.out.println(rev);
}
}
