import java.util.*;
class Compare {
  public static void main(String[] args) {
	  HashSet<String> hs1  = new HashSet<String>();
	  hs1.add("A");
	  hs1.add("B");
	  hs1.add("C");
	  hs1.add("D");
	  hs1.add("E");
	  System.out.println("first hashset is " +hs1);
	  
	  HashSet<String> hs2 = new HashSet<String>();
	  hs2.add("D");
	  hs2.add("A");
	  hs2.add("K");
	  hs2.add("W");
	  System.out.println("second hashset is " +hs2);
	  
	  hs2.retainAll(hs1);
	  System.out.println("common elements are" +hs2);
	  
	  
  }
}