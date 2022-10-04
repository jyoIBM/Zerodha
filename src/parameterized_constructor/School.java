package parameterized_constructor;

public class School {
String schoolName;
int noOfstudents;
public School(String schoolName,int noOfstudents) {
	this.schoolName=schoolName;
	this.noOfstudents=noOfstudents;
}
public void standard() {
	for(int a=1;a<=noOfstudents;a++) {
		System.out.println("anu is the monitor of her class");
	}
	
}
}
