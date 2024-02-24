//1. copy all elements of java hashset to an OBJECT ARRAY
package ProgramTest;

import java.util.*;
//import java.util.HashSet;

public class HashSetProgram {
	public static void main(String[] args) {
		Set<Object> set=new HashSet();
		set.add("zaid");
		set.add("12");
		set.add("12.43");
		set.add('A');
		set.add("Deepak");
		set.add("Sakshi");
	  System.out.println("==========elements before convert to object array========");
	  for (Object object : set) {
		  System.out.println(object);
		
	}
	  Object [] array=set.toArray();
	  System.out.println("=====after copying all elements into onject array=======");
	  for (int i = 0; i < array.length; i++) {
		  System.out.println(array[i]);
		
	}
		
	}

}
