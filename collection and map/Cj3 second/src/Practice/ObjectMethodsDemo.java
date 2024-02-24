package Practice;

class Demo implements Cloneable{
	int id ;
	String name;
public Demo(int id ,String name){
	this.id=id;
	this.name=name;
	
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
protected void finalize() throws Throwable {
	System.out.println("finalize execute to clean up the memory");
	
}
@Override
protected Object clone() throws CloneNotSupportedException {
	System.out.println("obejct is being copied ");
	return super.clone();
}
}


public class ObjectMethodsDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("program starts");
		Demo d1=new Demo(101, "Dinga");
		Demo d2=(Demo)d1.clone();
		 
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d2.name);
	    System.out.println(d2.id);
		System.out.println("program ends ");
				
		
	}

}

