package newpackage;

import java.util.HashMap;

public class HashMapDemo {
	 public static void main(String args[]) {
		   // create hash map
		   HashMap newmap = new HashMap();
		      
		   newmap.put(1, "tutorials");
		   newmap.put(2, "point");
		   newmap.put(3, "is best");
		      
		   System.out.println("Map value before change: "+ newmap);
		      
		   String prevvalue=(String)newmap.put(3,"is great");
		      
		   System.out.println("Returned previous value: "+ prevvalue);
		      
		   System.out.println("Map value after change: "+ newmap);
		   }    


}
