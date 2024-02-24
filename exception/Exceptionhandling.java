import java.util.Scanner;
class Exceptionhandling{
	public static void main(String[] args) {
		String name="zaid";
		Scanner sc=new Scanner(System.in);
		System.out.println("program starts");
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the first number");
		int num2=sc.nextInt();
		try{
		
		int result = num1/num2;
		System.out.println(num1+"/"+num2+"= "+result);

	}finally{
		System.out.println(" finally block execute ");

	 }try{
	 	
		String name2=name.concat("zaid");
		System.out.println(name2);
	 }


	 	catch(NullPointerException e){
		e.printStackTrace();
        System.out.println(name);
	}
	System.out.println(name);
	System.out.println("program ends");

	

	}
	
}