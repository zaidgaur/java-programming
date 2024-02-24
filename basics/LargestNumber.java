//===============Question number-02z========================
import java.util.Scanner;
class Repeatition{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String st=scanner.nextLine();
		int arr[]=new int[256];
		int length=st.length();
		for (int i=0;i<length ; i++) {
			arr[(int)st.charAt(i)]++;
			
		}
		for (int i=0;i<arr.length ;i++ ) {
			if(arr[i]!=0){
				System.out.println((char)i+"is comes in string: "+arr[i]);
			}
			
		}


	}
}