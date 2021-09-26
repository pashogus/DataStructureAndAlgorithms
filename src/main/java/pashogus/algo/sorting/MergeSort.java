package pashogus.algo.sorting;

public class MergeSort {

	int data[];
	int tempdata[];
	
	public MergeSort(int inputData[])
	{
		this.data=inputData;
		this.tempdata=new int[data.length];
	}
	
	public void mergeSort()
	{
	int low=0;
	int high = data.length-1;
	sort(low,high);
	System.out.println("Sorted Array with Merge Sort Algorithm:");
	for(int input : data)
	{
		System.out.print(" "+input);
	}
	}
	
	
	public void sort(int low, int high)
	{
if(low<high)
{
		int middle = low + (high-low)/2;
		
		//below two lines will pick the first two elements whatever be the array size
		sort(low,middle); // eventually it will end up in low=0 , middle->high=0
		sort(middle+1,high); //eventually it will end up in middle+1->low=1,high=1
		mergePart(low,middle,high);
		System.out.println(middle);
}
	}
	
	void mergePart(int low, int middle, int high) {
		/*
		 * in first iteration low=0 ,high=1,middle=o , so it will copy first two elements to temp list.
		 * 
		 */
		for (int i = low; i <= high; i++)
		{
		tempdata[i] = data[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
		if (tempdata[i] <= tempdata[j]) {
		data[k] = tempdata[i];
		i++;
		} else {
		data[k] = tempdata[j];
		j++;
		}
		k++;
		}
		
		while (i <= middle) {
		data[k] = tempdata[i];
		k++;
		i++;
		}
		}
	
}
