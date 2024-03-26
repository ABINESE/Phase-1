package assistedPractice1;

public class ImplementationOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {1,2,3,4,5,6,7,8};
         for(int number:arr)
         {
        	 System.out.print(number+" ");
         }
         arr[2]=10;
         System.out.println();
         for(int number:arr)
         {
        	 System.out.print(number+" ");
         }
         System.out.println();
         int mularr [][]= {{1,2,3}, {4,5,6},{7,8,9}};
         
         for(int i=0;i<mularr.length;i++)
         {
        	 for(int j=0;j<mularr[1].length;j++)
        	 {
        		 System.out.print(mularr[i][j]+" ");
        	 }
        	 System.out.println();
         }
	}

}
