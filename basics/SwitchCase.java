import java .util.Scanner;
class SwitchCase{
	public static void main(String[] args) {
		System.out.println("welcome to ATM machine ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number what you want");
		int press=sc.nextInt();
		switch(press){
		case 1 : System.out.println("do you want to withdrawl money");
			break;
		case 2: System.out.println("deposit money");
			break;
		case 3 : System.out.println(" check balance ");
			break;
		default: System.out.println("wrong choice ");
		}
		System.out.println(" thank you for using this ATM machine ");
		

	}
}