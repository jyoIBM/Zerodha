package strings_methods;

public class A {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="city";
		//length()>>it will give count of characters
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
	    //toUpperCase()>> it will convert lowercase string to uppercase 
		System.out.println(s1.toUpperCase());

	    //toLowerCase>> it will convert uppercase string to lowercase 
		System.out.println(s2.toLowerCase());
		
		//equals()>> it will compare to strings
		System.out.println(s1.equals(s2));//false
		//eqaulIgnoreCase>> it will compare two strings ignoring their cases
		System.out.println(s2.equalsIgnoreCase(s1));//true
		
		//contains()>> it will check for characters inside to strings..
		System.out.println(s1.contains(s3));
		//charAt()>> it will give character of string at particular position(SIOOBE)
		System.out.println(s1.charAt(5));
		
		//indexOf()>> it will give index of particular character
		System.out.println(s2.indexOf('Y'));
		
		//lastIndexOf()>> it will give last index of string
		System.out.println(s1.lastIndexOf('t'));
		
		//startWith()>> it will check our string is start with particular characters
		System.out.println(s1.startsWith("vy"));//true
		
		// endsWith()>> it will check our string is ends with particular characters
		System.out.println(s1.endsWith("ty"));
		
		//substring()>> it will break the the string and display
		System.out.println(s1.substring(4));
		
		//concat()>>  it will join two strings
		System.out.println(s1.concat(s2));//velocitycity
		
		//replace()>> it will replace the collection of charcters
		System.out.println(s1.replace("city","rural"));
		
	}


	}

