import java.util.*;
class Associate {
  public static void main(String[] args) {
    HashMap<String,String> hm = new HashMap<String,String>();
	hm.put("first", "Avnish")	;
	hm.put("second","piyush");
	hm.put("third","satyam");
	hm.put("fourth","sajan");
	
	Set keys = hm.entrySet();
	Iterator i = keys.iterator();
	
	while(i.hasNext()) {
		Map.Entry m = (Map.Entry)i.next();
		System.out.print(": " +m.getKey() );
	System.out.print(": " +m.getValue());
	System.out.println();
  }
}
}