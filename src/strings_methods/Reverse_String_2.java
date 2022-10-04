package strings_methods;

public class Reverse_String_2 {
public static void main(String[] args) {
	String anj="ANJALI";
	String rev="";
	for(int a=anj.length()-1;a>=0;a--) {
		rev=rev+anj.charAt(a);
	}
	System.out.println(rev);
}
}
