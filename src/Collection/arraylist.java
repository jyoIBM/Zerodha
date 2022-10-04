package Collection;

import java.util.ArrayList;

public class arraylist {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
    al.add("Amar");
    al.add('A');
    al.add(1000);
    al.add(null);
    al.add(1000);
    al.add("jyoti");
    
  System.out.println(al);
   // System.out.println(al.size());
    //System.out.println(al.isEmpty());
   System.out.println(al.contains(1000));
   
    //al.add(2,2000);
    //System.out.println(al.get(2));
    //System.out.println(al);
    
   // al.remove(3);
   // System.out.println(al);
    
    //al.clear();
    //System.out.println(al);
}
}
