package Non_Primitive_Casting;

public class Son extends Father {
public void money() {
	System.out.println("money:150");
}
public void mobile() {
	System.out.println("mobile");//newly added properties inside the subclass can't be printed 
}
}
