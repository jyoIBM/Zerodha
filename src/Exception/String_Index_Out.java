package Exception;

public class String_Index_Out {
public static void main(String[] args) {
	String s="AMAR";
	System.out.println(s.length());//4-1=3
	System.out.println(s.charAt(4));// if u try to fetch index which is not there then we will get string index out of bond exception
}
}
