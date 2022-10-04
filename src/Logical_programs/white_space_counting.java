package Logical_programs;

public class white_space_counting {
public static void main(String[] args) {
	String name="A M A R J Y O T I";
	int count=0;
	for(int i=0;i<=name.length()-1;i++) {
		char ch = name.charAt(i);
		if(ch==' ') {
			count++;		
		}
	}
	System.out.println(count);
}
}
