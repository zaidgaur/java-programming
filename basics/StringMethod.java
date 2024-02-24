//=======assignment 5--- input: Azam Amir Reza output: mazA rimA azeR=============
class StringMethod{
	public static void main(String[] args) {
		String input="Azam Amir Reza";
		System.out.println("input:"+input);
		String [] arr= input.split(" ");
		String rev=" ";
		for (int i=0;i<arr.length ; i++) {
			int length=arr[i].length();
			for (int j=length-1;j>=0 ;j-- ) {
				rev=rev+arr[i].charAt(j);
			}
			rev=rev+" ";
			
		}
		System.out.println("output: "+rev);
	}
}

