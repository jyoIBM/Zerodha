package Conditional_statement;

public class If_Else_Ladder_1 {
public static void main(String[] args) {
	int marks=50;
	if(marks>=75) {
		System.out.println("pass with distinction");
	}
	else if(marks>=65) {
		System.out.println("pass with 1st class");
	}
	else if(marks>=55) {
		System.out.println("pass with 2nd class");
	}
	else if(marks>=45) {
		System.out.println("pass with3rd class");
	}
	else{
		System.out.println("fail in exam");
	}
}
}
