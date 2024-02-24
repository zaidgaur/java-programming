//5. enter elements by using the arraylist collection and remove elementa at 2nd index without using collection:
package ProgramTest;

import java.util.*;

public class ArrayListUse {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("zaid");
		list.add("yamama");
		list.add("ghazal");
		list.add("saquib");
		list.add("deeppak");
		list.add("ayan");
		list.add("suhail");
		list.add(2,"khali");
		System.out.println("======= before removing elements fro colelction========");
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println(list.size());
		ListIterator it=list.listIterator();
		while (it.hasNext()) {
			Object name =it.next();
			if(name=="ghazal"){
				it.remove();
			}
			
		}
		System.out.println("====after removing elements from collection =====");
		for (Object object : list) {
			System.out.println(object);
			
		}
		System.out.println(list.size());
	}
       
    
}
