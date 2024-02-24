package advance;


public class Finalize {

	public static void main(String[] args) {
		System.out.println("program starts");
		Demo d1=new Demo(101, "Dinga");
		//after crteate object of demo class we can use by calling the demo class property
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d1.toString());
		System.out.println("d1 object uses is done ");
		//d1=null;
	//System.out.println(d1.id); //null .id will throw you Null pointer exception
	//System.gc();
	System.out.println("other some code has to be executed ");
		System.out.println("program ends ");
				
		
	}

}
