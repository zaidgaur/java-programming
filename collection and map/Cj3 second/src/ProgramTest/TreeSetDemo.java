//3. sort on the basis of id of employee class 
package ProgramTest;

import java.util.*;

 class Employee implements Comparable{
	int id ;
	String name ;
	public Employee(String name,int id){
		this.id=id;
		this.name =name ;
	}
	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	@Override
	public String toString() {
		return name+" "+id;
	}
	@Override
	public int compareTo(Object o) {
		Employee employee=(Employee)o;
		return -(this.id-employee.id);
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(new Employee("zaid",102));
		set.add(new Employee("Arun",103));
		set.add(new Employee("harshit",104));
		set.add(new Employee("Deepak",105));
		set.add(new Employee("Aquib",106));
		
	 for (Object object : set) {
		 System.out.println(object);
		
	}	
	     
	}

}
