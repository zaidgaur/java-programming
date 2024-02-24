class Count{
	public static void main(String[] args) {
		int count;
		for (int i=0;i<2 ;i++ ) {
			count=1;
			System.out.println(count);
			for (int j=i+1; j<3;j++ ) {
				System.out.println(count);
				count++;
				System.out.println(count);
				
			}
			
		}
	}
}