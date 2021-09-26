package pashogus.search;

public class RecursiveBinarySearch {

	
	/*
	 * 20,30,50,60,67,83,96
	 * 1) mid element -> 3 , 60<67 
	 * 2) low - 4  , high - 7 , mid -5 , 83<67
	 * 3) low -4 , high-6 , mid-5
	 *
	 */
	int data[];
	int param;
	
	public RecursiveBinarySearch(int input[], int param)
	{
		this.data=input;
		this.param=param;
	}
		
	public Boolean binarySearch()
	{
	 int low=0;
	 int high=data.length;
	if(search(low,high) == param)
	{
		return Boolean.TRUE;
	}
	else
	{
		return Boolean.FALSE;
	}

	}
	
	public int search(int low, int high)
	{
		//without this if block, the loop will go in infinite loop , if element is not present.
		if(low <=high)
		{
		int mid= low + (high-low)/2;
		if (data[mid]== param)
		{
			return param;
		}
		if (data[mid] < param)
		{		
			//if we haven't return statement here, it will execute else case , for the previous search method object
			//as we calling search method recursively.
			return search(mid+1,high);
		}
		else
		{
			return search(low,mid-1);
		}
		}
		else
		{
			return -1;
		}
		
	}

}
