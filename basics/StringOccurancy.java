import java .util.Scanner;
class StringOccurancy{
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int count[]=new int[256];
		System.out.println("enter the string which occurance you want to check");

		String string=scanner.nextLine();
		int length=string.length();
		for (int i=0;i<length ;i++ ) {
			count[(int)string.charAt(i)]++;
			
		}
		for (int i=0; i<256; i++) {
			if(count[i]!=0){
				System.out.println((char)i+" "+count[i]);
			}
			
		}

	}
}
