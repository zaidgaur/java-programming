
//===================================Problem-1:program================================================

class ArrayAndTarget1{
	public static void main(String[] args) {

	//===================================Example-1====================================================
		 int[] arr={2,7,11,15};
		 int target=9;
		 ArrayAndTarget2 arrayAndTarget2=new ArrayAndTarget2();
		int[] solved=arrayAndTarget2.sumOfTwo(arr,target);
		if(solved[0]!=-1 && solved[1]!=-1){
				System.out.println("output:["+solved[0]+","+solved[1]+"]");
		}else{
				System.out.println("No result found as same as target");
			}	

	 //===================================Example-2=====================================================
		
		int[] arr1={3,2,4};
		 int target1=6;
		 ArrayAndTarget2 arrayAndTarget3=new ArrayAndTarget2();
		int[] solved1=arrayAndTarget3.sumOfTwo(arr1,target1);
		if(solved1[0]!=-1 && solved1[1]!=-1){
				System.out.println("output:["+solved1[0]+","+solved1[1]+"]");
		}else{
				System.out.println("No result found as same as target");
			}	


	//======================================Example-3====================================================

        int[] arr2={3,3};
		 int target2=6;
		 ArrayAndTarget2 arrayAndTarget4=new ArrayAndTarget2();
		int[] solved2=arrayAndTarget4.sumOfTwo(arr2,target2);
		if(solved2[0]!=-1 && solved2[1]!=-1){
				System.out.println("output:["+solved2[0]+","+solved2[1]+"]");
		}else{
				System.out.println("No result found as same as target");
			}	

	}
}