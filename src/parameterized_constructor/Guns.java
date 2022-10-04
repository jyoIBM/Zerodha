package parameterized_constructor;

public class Guns {//Business logic class
String gunName;
int noOfBullets;
public Guns(String gunName,int noOfBullets) {
	this.gunName=gunName;
	this.noOfBullets=noOfBullets;
}
public void shoot() {
	for(int i=1;i<=noOfBullets;i++) {
		System.out.println("dishkew");
	}
}
}
//this used to access the address of Gun name and no. of bullets (global variable)