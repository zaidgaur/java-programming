package advance;

import java.util.ArrayList;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList collection =new ArrayList();
		collection.add(10);
		collection.add(12.3);
		collection.add(true);
		collection.add(new Demo(234, "zaid"));
		System.out.println(collection.size( ));
		System.out.println(collection);
		collection.remove(true);
		System.out.println(collection.size( ));
		System.out.println(collection);
		
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(4);
		set.add(30);
		set.add(2);
		System.out.println(set);

	
	}

}
