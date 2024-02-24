class Duplicacy{
	public static void main(String[] args) {
		String str="allah";
		int count;
		char []chars=str.toCharArray();
		for (int i=0;i<str.length() ;i++ ) {
			count =1;
			for (int j=i+1;j<str.length() ;j++ ) {
				if(chars[i]==chars[j]){
					count++;
					
					chars[j]='0';

				}
				if(count>1 && chars[i]!='0'){
					System.out.println(chars[i]);
				}

				
			}
			
		}
	}
}