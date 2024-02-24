package advance;
import java.util.*;
public class Comparable1 {

	public static void main(String[] args) {
		Set set1 = new TreeSet();
		set1.add("zaid");
		set1.add("ayan");
		
		set1.add("aman");
		
		set1.add("umar");
		
		Set set2 = new TreeSet();
		set2.add("deepak");
		set2.add("hasrshit");
		
		set2.add("sakshi");
		
		set2.add("arun");
		System.out.println("before add all : "+set2.size());
		set2.addAll(set1);
		System.out.println(set2);
		System.out.println("after add all the size of set2 : "+set2.size());
		System.out.println(set2.remove(2));
		System.out.println(set2);


	}

}
