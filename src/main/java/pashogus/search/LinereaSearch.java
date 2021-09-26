package pashogus.search;

public class LinereaSearch {

	public static void main(String[] args) {
	
		int array[]={20,10,50,3,1,4,7,};
      if(Boolean.TRUE.equals(search(array,4)))
      {
    	  System.out.println("Element Found " );
      }
      else
      {
    		System.out.println("Element not found " ); 
      }
		
		
	}
	
	public static Boolean search(int data[], int param)
	{
		for(int input : data )
		{
			if(input == param)
				
			{
				return Boolean.TRUE;
				
			}
		}
	return Boolean.FALSE;
	
	}

}
