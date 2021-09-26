package pashogus.algo.sorting;

public class BubbleSort {
	
	 int data[] ;
	
	public BubbleSort(int inputData[])
	{
		this.data=inputData;
	}

	public  void bubbleSort()
	{
		
		for( int i=0 ; i<data.length ; i++)
		{
			for (int j=i+1; j<data.length ; j++)
			{
				if(data[i]>data[j])
				{
					int temp= data[j];
					data[j]=data[i];
					data[i]=temp;
					
				}
			}
		}
	
		System.out.print("SortedArray with Bubble Sort Algorithm:");
		for(int dataLoop : data)
		{
			System.out.print(" "+dataLoop);
		}

		
		
	}
}
