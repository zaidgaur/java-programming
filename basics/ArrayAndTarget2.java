class ArrayAndTarget2{
	public int[] sumOfTwo(int[] num,int target){
		int[] solved=new int[2];
         for (int i=0;i<num.length-1;i++ ) {
         	for (int j=i+1;j<num.length ;j++ ) {
         		if(num[i]+num[j]==target){
         		solved[0]=i;
         		solved[1]=j;

         		return solved;

         	}
         		
         	}
         	
         }


         int[] indices={-1,-1};
         return indices;

	}

	
}