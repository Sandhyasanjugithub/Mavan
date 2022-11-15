package practice;



public class SpecificEleArray {
	public static  void containsDuplicate(int[] a)
	{
	
	        for (int i = 1; i < a.length;  i++) 
	        {
	            for (int j = 0; j < i; j++)
	            {
	                if (a[i] == a[j])
	                {
	                	   System.out.println("Duplicates are present"  +       a.length);
	                   
	                }
	            }
	        }
	               		                
	            
	         
	        }
	        
			public static  void notcontainsDuplicate(int[] a)
	  {
	        for (int i = 1; i < a.length;  i++) 
	        {
	            for (int j = 0; j < i;  j++)
	            {
	                if (a[i] != a[j])
	                {
	                    
	                }
	                             
	            }
	         
	        }
			 System.out.println("Duplicates are present"  +       a.length);

	       
	    
	    }


public static void main(String[] args)

{
  int a[] = {5,3,12,15,6,2};
  containsDuplicate(a);
  notcontainsDuplicate(a);
}
}


