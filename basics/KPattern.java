class KPattern{
	public static void main(String[] args) {
		int n=3;
		for (int i=0;i<5 ;i++ ) {
			for (int j=0;j<5 ;j++ ) {
				if(j==0||j==n){
					System.out.print("* ");

				}else{
					System.out.print("  ");
				}
				if(i<=n&&n!=0){
					n--;
				}else{
					n++;
				}
				
			}
			System.out.println();
			
		}
	}
}