package pack1;

import java.util.LinkedHashSet;

class Employee{
	String  name;
	int id;
	public Employee(String name, int id ){
		this.name=name;
		this.id=id;
		
	}
	@Override
	public int hashCode() {
		return id ;
	}
	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		   return this.id==employee.id&&this.name.equals(employee.name);
	}
    @Override
    public String toString() {
    	
    	return name+" "+id;
    }
	
}

public class EmployeeCollection {

	public static void main(String[] args) {
		Employee employee=new Employee("zaid",807);
		Employee employee1=new Employee("Deepak",803);
		Employee employee2=new Employee("Sakshi",808);
		Employee employee3=new Employee("harshit",809);
		Employee employee4=new Employee("Arun",910);
		Employee employee5=new Employee("Arun",910);
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(employee);
		lh.add(employee1);
		lh.add(employee2);
		lh.add(employee3);
		lh.add(employee4);
		lh.add(employee5);
		System.out.println(lh);
		
		
		
		
		
		

	}

}
