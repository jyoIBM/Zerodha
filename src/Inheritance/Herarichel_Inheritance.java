package Inheritance;

public class Herarichel_Inheritance {
public static void main(String[] args) {
	Son1 s1 = new Son1();
	s1.home();
	s1.car();
	s1.money();
	s1.secBike();
	System.out.println("good");
	System.out.println("properties of son1");
	
	Son2 s2 = new Son2();
	s2.home();
	s2.car();
	s2.money();
	s2.secLappy();
	System.out.println("bad");
	System.out.println("properties of son2");
	
	Son3 s3 = new Son3();
	s3.home();
	s3.money();
	s3.car();
	s3.secMobile();
	System.out.println("excellent");
	System.out.println("properties of son3");
	
}
}
