package superkeyword;

public class Sample2 extends Sample1{
int a=50;
int b =30;
int c=(a+b);

public void test() {
	int a=10;
	int b= 50;
	int c=(a*b);
	System.out.println(c);
	System.out.println(this.c);
	System.out.println(super.c);
}
}
