package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class ArrayLinkedDemo {

	public static void main(String[] args) {
		System.out.println("================Arrayt List===========");
		ArrayList<String> v=new ArrayList<String>();
		v.add("Arun");
		v.add("Zaid");
		v.add("Sakshi");
		v.add("Lovely");
		v.add("Deepak");
		//System.out.println(v.get(0));
		Iterator it=v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("===============Linked List=====================");
		LinkedList<String> s=new LinkedList<String>();
		s.add("Arun");
		s.add("Zaid");
		s.add("Sakshi");
		s.add("Lovely");
		s.add("Deepak");
		//System.out.println(s.get(3));
		Iterator it2=s.iterator();
		while (it2.hasNext()) {
			String name = (String)it2.next();
			System.out.println(name);
			
//			if (name.equals("Deepak")) {
//				it2.remove();
//				System.out.println("Deepak removed");
//				
//			}
		     
		}
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		System.out.println(s.size());
		
		

	}

}
