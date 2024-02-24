class CamelCase{
	public static void main(String[] args) {
		String input="allah";
		char arr[]=input.toCharArray();
		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j=i+1; j<arr.length;j++ ) {
				if(arr[i]>arr[j]){
					System.out.println(arr[j]+" is a duplicate");
				}

				
			}
			
		}
		    
	
	}
}