package unit;

public class BiggestFromArray {

	static int num[]= {10,5,4,25,200,40};
	static int biggest =num[0];
	
	static int findBiggest1() {
		          
	        // Initialize maximum element
	                
	        // Traverse array elements from second and
	        // compare every element with current max
	        for (int i=0; i < num.length; i++)
	        {
	            if (num[i] > biggest)
	            {
	            	biggest=num[i];
	            }
	               
	        }
			return biggest;
	}
}
