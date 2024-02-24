package db;
//its same package but another class and access same package class property.. 
public class B {

	public static void main(String[] args) {
	  System.out.println(A.i); //its accessible because its public can be access anywhere 
	                           //in same package, other package even other project also .. 
	  System.out.println(A.j); //its accessible because its protected property its accessible same package
	                           //other package but as a subclass only using inhertance ...
	  System.out.println(A.k); //its accessible because because its package property its accessible only in same package .
	  //System.out.println(A.l); //here its non accessible because l variable is 
	                           //declared as private and private is access only same class where its declared ..

	}

}
