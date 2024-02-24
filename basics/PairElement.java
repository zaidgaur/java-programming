//========================================Program:1================================================

class PairElement{
	public static void main(String[] args) {
		int[] input={1,2,8,7,15,19,4};
		//output=(1,7)(8,7)(15,4)
        System.out.print("output:");
		for (int i=0;i<input.length-1 ;i++ ) {
			for (int j=i+1;j<input.length ;j++ ) {
				for (int k=0;k<input.length ;k++ ) {
					if(input[i]+input[j]==input[k]){
						System.out.print("("+input[i]+","+input[j]+") ");
					}
					
				}
				
			}
			
		}
	}
}