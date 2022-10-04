package Exception_Handling;

public class Airthmatic_exception {
public static void main(String[] args) {
	int a=1;
	int b=0;
	try {
		int c=a/b;//risky code
	}
	catch(ArithmeticException ref) {//catual exception name and reference variable name
		System.out.println("Idiot...!Enter valid denominator");
	}
	System.out.println("Boss exception is handled");
}
	
}
