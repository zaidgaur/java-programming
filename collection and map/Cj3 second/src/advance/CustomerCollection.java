package advance;
import java.util.HashSet;


class Customer {
		String name;
		int id;

		public Customer(String name, int id) {
			this.name = name;
			this.id = id;
		}

		/*
		 * HashSet will use the `equals()` & `hashCode()` implementations of the
		 * Customer class to check for duplicates and ignore them
		 */
		
		@Override
		public int hashCode() {
			return id;
		}

		@Override
		public boolean equals(Object obj) {
			Customer customer = (Customer) obj;
			return this.id==customer.id && this.name.equals(customer.name);
		}

		
		@Override
		public String toString() {
			return name+" "+id;
		}

}

public class CustomerCollection {

	public static void main(String[] args) {
		
				HashSet set = new HashSet();
				set.add(new Customer("deepak",4));
		        set.add(new Customer("pradeep",105));
		        set.add(new Customer("p1radeep",105));
		        set.add(new Customer("Chandan",2));
		        set.add(new Customer("shradha",3));
		        
		         System.out.println(set);
			}

}

