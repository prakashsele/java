package newpackage;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String args[]) {
    	 ArrayList<String> obj = new ArrayList<String>();


obj.add("James");
obj.add("Ram");
obj.add("Ramu");
obj.add("Rithu");
obj.add("Manoj");


System.out.println("Currently the array list has following elements:"+obj);


obj.add(0, "Rahul");
obj.add(1, "Kishore");


obj.remove("Ramu");
obj.remove("James");

System.out.println("Current array list is:"+obj);


obj.remove(1);

System.out.println("Current array list is:"+obj);
 }

}
