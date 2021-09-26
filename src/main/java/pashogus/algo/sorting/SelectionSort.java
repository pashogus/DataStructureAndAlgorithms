package pashogus.algo.sorting;

public class SelectionSort {
	
	// 2, 1, 3
	// 1,2,3

	 int data[] ;
		
		public SelectionSort(int inputData[])
		{
			this.data=inputData;
		}
		
		public void selectionSort()
		{
			
			for (int i=0 ; i<data.length ; i++)				
			{	
				int temp = data[i];
				for (int j=i+1 ; j<data.length ; j++)
				{
					if(temp > data[j])
					{
						data[i]=data[j];
						data[j]=temp;
					}
				}
			}
			
			System.out.print("SortedArray with Selection Sort Algorithm:");
			for(int dataLoop : data)
			{
				System.out.print(" "+dataLoop);
			}
		}
}
