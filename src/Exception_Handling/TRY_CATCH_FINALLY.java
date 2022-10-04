package Exception_Handling;

public class TRY_CATCH_FINALLY {
public static void main(String[] args) {
	try {
		System.out.println(18/0);//risky code
	}
	catch(NullPointerException g) {
		System.out.println("denominator is not valid");
	}
	finally {
		System.out.println("Thank you for using ATM");
	}
}
}
