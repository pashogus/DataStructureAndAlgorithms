package pashogus.algo.sorting;

import java.util.concurrent.SynchronousQueue;


/*
 * //pivot is at index 7 , low=0 high =6
	// 2, 9, 1, 4, 5, 6, 8,7   i=-1 , initial array
	// 2, 9, 1, 4, 5, 6, 8,7   i=0 , j=0 , as 2<7 ,         swap it , but here both i and j =0 a[0] to a[0]
	// 2, 9 , 1, 4, 5, 6, 8,7  i=0 , j=1 , as 9>7 ,         no swap needed as 9>7 
	// 2, 1, 9, 4, 5, 6, 8,7   i=1 , j=2 , as 1<7 ,          swap a[2] to a[1] position, a[j] to a[i]
	// 2, 1, 4, 9, 5, 6, 8, 7  i=2 , j=3 , as 4 <7 ,          swap a[3] to a[2] position, a[j] to a[i]
	// 2, 1, 4, 9, 5, 6, 8, 7  => 2, 1, 4, 5, 9 , 6, 8, 7     i=3 , j=4 , swap a[4] to a[3] position, a[j] to a[i]
	//  2, 1, 4, 5, 9 , 6, 8, 7  => 2, 1, 4, 5, 6 , 9, 8, 7   j=5, i=4 , swap a[5] to a[4] position, a[j] to a[i]
	// 2, 1, 4, 5, 6 , 9, 8, 7 =>  2, 1, 4, 5, 6 , 9, 8, 7    j=6 , i=4 , no swap needed as 8>7
	// 2, 1, 4, 5, 6 , 9, 8, 7 => 2,1,4,5,6,7,8,9             moving pivot element to the index of i+1 and element in i+1 to high
	
	//pivot is at index 4 (previous iteration pivot index -1), low = 0 high =4 , loop will execute till 4-1 , i=-1
	// loop is for 2,1,4,5,6
	// 2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9   i=0 (-1+1) , j=0 , 2<6  , swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9    i=1 (0+1) , j=1 , 1<6 , swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9    i=2 (1+1) , j=2 , 4<6 , swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9    i=3 (1+1) , j=3 , 5<6 , swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9    moving pivot element to index i+1 => 4
	
	
	//for this iteration pivot is at index 3 , index returned by previous iteration is 4 , 
	// loop is for 2,1,4,5  low =0 , high 3 (pivot index-1) , loop will go from 0 to 2
	//i=-1
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9   2<5 i=0,j=0 swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9   1<5 i=1, j=1 swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9   4<5 i=2, j=1 swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9   moving pivot element to position i+1 -> 3 and return pivot index as i+1 -> 3
	
	//for this iteration pivot is at index 2 , index returned by previous iteration is 3 , 
	// loop is for 2,1,4  low =0 , high 2 (pivot index-1) , loop will go from 0 to 1
	//i=-1
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9 2<4  i=0,j=0 swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9 1<4  i=1,j=1 swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9 moving pivot element to i+1 => 2 and return pivot index as i+1 -> 2
	
	//for this iteration pivot is at index 1 , index returned by previous iteration is 2 , 
		// loop is for 2,1  low =0 , high 1 (pivot index-1) , loop will go from 0 to 0
		//i=-1
		//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9 2>1, no swap needed  i=-1,j=1 
	  //2,1,4,5,6,7,8,9 => 1,2,4,5,6,7,8,9   moving pivot index to i+1 =>0 and return pivot index as 0
		
	
	// pivot is at index 7, low = 6 , high =7 , loop will run from 6 to 7-1
	// loop is for 8,9 
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9     8<9 i=0 , j=0 swap , swap a[j] to a[i]
	//2,1,4,5,6,7,8,9 => 2,1,4,5,6,7,8,9    moving pivot element to index i+1 => 1 
 */

public class QuickSort {

	
	
	
	int data[];
	
	public QuickSort(int inputData[])
	{
		this.data=inputData;
	}
	
	
	public void quickSort(){
		
		int low=0;
		int high=data.length-1;
		sort(low,high);
		System.out.println("SortedArray with Quick Sort Algorithm:");
		print();
	}
	
	public void print()
	{
		for(int input : data)
		{

			System.out.print(" "+input);
		}

	}
	
	public void sort(int low , int high)
	{
		if(low <high)
		{

		//0, 7 -  0th and 7th position
		int pivotindex = pivotIndex(low,high);

		//pivot index is 5
		//0, 4 -  0th and 4th position
		sort(low,pivotindex-1);
		sort(pivotindex+1,high);
		}
	}
	
	public int pivotIndex(int low, int high)
	{
         	 int pivot = data[high];
	 int i=low-1;
	 
		for(int j=low ; j<high ; j++)
		{
 	if(data[j]<=pivot)
			{
				i++;
				int temp=data[i];
				data[i]=data[j];
				data[j]=temp;
			}
		}
		
	int temp=data[i+1];	
	data[i+1]=data[high];
	data[high]=temp;
			
	
		return i+1;
	}
}
