package Conditional_statement;

public class If_Else_ladder_2 {
public static void main(String[] args) {
	int age=50;
	if (age<5) {
		System.out.println("these are Kids");
	}
	else if (age>13 && age<20) {
		System.out.println("these are Teenagers");
	}
	else if(age>21 && age<35) {
		System.out.println("these are Adult");
	}
	else if(age>36 && age>=50) {
		System.out.println("these are Old age");
	}
	else {
		System.out.println("uncatgorized");
	}
}
}
