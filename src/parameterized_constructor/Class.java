package parameterized_constructor;

public class Class {
public static void main(String[] args) {
	School s =new School("DPS",12);
	s.standard();
	System.out.println("1st class complete");
	
	School s1 =new School("ITM",15);
	s1.standard();
	System.out.println("2nd class complete");
	
	School s2 = new School("lAS",17);
	s2.standard();
	System.out.println("3rd class complete");
}
}
