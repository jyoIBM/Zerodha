package parameterized_constructor;

public class PubG {
public static void main(String[] args) {
	Guns g =new Guns("Ak47",10);
	g.shoot();
	System.out.println("1st shoot complete");
	
	Guns g1 = new Guns("FNP90",7);
	g1.shoot();
	System.out.println("2nd shoot complete");
	
	Guns g2 = new Guns("SKS",6);
	g2.shoot();
	System.out.println("3rd shoot complete");
	
	Guns g3 = new Guns("AKM",5);
	g3.shoot();
	System.out.println("4th shoot complete");
	
	Guns g4 = new Guns ("M14 rifle",4);
	g4.shoot();
	System.out.println("5th shoot complete");
}
}
