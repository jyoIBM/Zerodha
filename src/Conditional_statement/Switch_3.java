package Conditional_statement;

public class Switch_3 {
	public static void main(String[] args) {
		switch("marks got in english exam 75") {
		
		case"marks got in english exam 65":{
			System.out.println("pass with 1st class");
			break;
		}
		case"marks got in english exam 55":{
			System.out.println("pass with second class");
			break;
		}
		case"marks got in english exam 75":{
			System.out.println("pass with distinction");
			break;
		}
		default:
			System.out.println("fail in english exam");
			break;
		}
	}

}
