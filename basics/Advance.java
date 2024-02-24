import java.util.Scanner;
class Advance{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //step2
		System.out.println("Enter your username ");
		String userName=sc.next();

		System.out.println("Enter your full name ");
		sc.nextLine();
		String fullName=sc.nextLine(); //step3
		
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		System.out.println("Enter your marks ");
		Double marks =sc.nextDouble();
		System.out.println("Enter your gender in one character ");
		String gender=sc.next();
		char c =gender.charAt(0);
		
		System.out.println(fullName);
		System.out.println(userName);
		System.out.println(age);
		System.out.println(marks);
		System.out.println(gender);


	}

}