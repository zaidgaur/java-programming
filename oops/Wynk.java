class Wynk{
	String name ;
	long phone ;
	int amt;
	Wynk(){
		System.out.println("free  user without registration");
	}
	Wynk(String n , long ph){
		System.out.println("registered user");
		name =n;
		phone =ph;

	}
	Wynk(String n, long ph, int a){
		System.out.println("premium registerd user");
		name =n;
		phone=ph;
		amt=a;
	}
	void details(){
		System.out.println("======user details=====");
		System.out.println("NAme: "+name);
		System.out.println("Contact No.: "+phone );
		System.out.println("subscription amount : "+amt);
	}

}

class WynkUser{
	public static void main(String[] args) {
		Wynk us1=new Wynk();
		Wynk us2=new Wynk("lovely",7500160378l);
		Wynk us3=new Wynk("prativa",8958765207l,500);
		us1.details();
		us2.details();
		us3.details();
	} 
}

