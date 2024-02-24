package pack1;

public class Linga implements Cloneable {
	String nameStart;
	 int id;
	 String name;
	public Linga(int id ,String name , String nameStart){
		this.id=id;
		this.name=name;
		this.nameStart=nameStart;
		
	}
	 
	@Override
	public int hashCode() {
		return id;
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is call memory is cleaning ");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("object is being copied ");
		return super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
		
	}
	@Override
	public String toString() {
		return name+" "+id;
	}

}
