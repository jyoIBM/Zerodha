package Method;

public class NonStatSameclass {
public static void main(String[] args) {
	NonStatSameclass n= new NonStatSameclass();
	 n.ab1();
	 n.ab2();
	 n.ab3();
	 n.ab4();
}

public void ab1() {
	System.out.println("running ab1 from same class");
}
public void ab2() {
	System.out.println("running ab2 from same class");
}
public void ab3() {
	System.out.println("running ab3 from same class");
}
public void ab4() {
	System.out.println("running ab4 from smae class");
}

}
