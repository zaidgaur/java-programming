package ja;
import db.A;
//its another package class and accessa anotehr package class property.

public class C extends A{

	public static void main(String[] args) {
		System.out.println(A.i);//its accessible because its public property..
		System.out.println(A.j);//its accesible beacause we use ineheritance here extends class where its present 
		                        //if dont extends then dont accessible because protected property only acces inside package 
		                        //or outside package class also but if class extends property class and make own a subclass 
		//System.out.println(A.k);//it doesnt accessible ebacause package level proeprty only access within the package .
		//System.out.println(A.l);//its also not accesible because private property on;y access in within the class not
		                        //even same package different class .
		
	}

}
