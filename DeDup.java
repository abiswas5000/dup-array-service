import java.lang.reflect.Array;
import java.util.Arrays;


public class DeDup {
	
	
	
	public static void main(String[] args) {
				
		int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
	            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
	            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};   
		
		
	}
	
	
	// method 1
	public void removeDups(int [] arr)
	{
		
	       
	        //sorting the elements
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=i;j<arr.length;j++)
	            {
	                if(arr[i]>arr[j])
	                {
	                    int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }

	            }
	        }

	      
	        
	        int b=0;
	        arr[b]=arr[0];
	        for(int i=0;i<arr.length;i++)
	        {
	            if (arr[b]!=arr[i])
	            {
	                b++;
	                arr[b]=arr[i];
	            }
	        }
	        for (int i=0;i<=b;i++ )
	        {
	            System.out.print(arr[i]+"\t");
	        }
	    }

	// method 2
	public  void removeDup(int[] inputArray)
    {        
       int num = inputArray.length;
        for (int i = 0; i < num; i++) 
        {
            for (int j = i+1; j < num; j++)
            {
               if(inputArray[i] == inputArray[j])
                {
                	inputArray[j] = inputArray[num-1];
                                             
                    num--;
                                               
                    j--;
                }
            }
        }
         
        int[] outArray = Arrays.copyOf(inputArray, num);
                 
        for (int i = 0; i < outArray.length; i++)
        {
            System.out.print(outArray[i]+"\t");
        }
     
    }
	// method 3
	public void  removeDuplicates(int[] arr) {
		
		int[]	outPut= Arrays.stream(arr)
	            .distinct()
	            .toArray();
		for (int name : outPut)
		    System.out.println(name);
	    
	    
	}

}
