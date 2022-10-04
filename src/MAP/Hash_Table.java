package MAP;

import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.Set;

public class Hash_Table {
public static void main(String[] args) {
	Hashtable<Integer,String> ht=new Hashtable<Integer,String> ();
	ht.put(101,"Ankush");//1st entry
	ht.put(102,"sanjay");//2nd entry
	ht.put(103,"kush");//3st entry
	ht.put(104,"jay");//4nd entry
	//using cursor iterator
//	Set s = ht.entrySet();
//	Iterator itr = s.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
	//}
	//using for each loop
for( int k:ht.keySet()) {
	System.out.println(k+" "+ht.get(k));
	
}
}
}
