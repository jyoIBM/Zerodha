package Exception;

public class Null_Pointer_exception {
	int i=12;//whenever we r trying to fetch the nonstatic members with null reference then we will get NPE
public static void main(String[] args) {
	Null_Pointer_exception npe=null;
	System.out.println(npe.i);
}
}
