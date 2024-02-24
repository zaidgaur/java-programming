 class K{
 	public static void main(String[] args) {
 		for (int i=0;i<5 ;i++ ) {
 			for (int j=0;j<5 ;j++ ) {
 				if (j==2||(i+j==4)&&(j>2)||(i==3&&j==3)||(i+j==8)) {
 					System.out.print("* ");
 					
 				}else{
 					System.out.print("  ");
 				}
 				
 			}
 			System.out.println();
 			
 		}
 	}
 }