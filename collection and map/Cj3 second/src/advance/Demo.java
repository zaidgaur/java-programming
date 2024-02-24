package advance;

class Demo{
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
	System.out.println("finalize execute to clean up the memory"); //getcalled by garbage collector;
}
}
