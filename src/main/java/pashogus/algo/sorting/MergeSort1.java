package pashogus.algo.sorting;

public class MergeSort1 {

	int data[];
	 int count=0;
	
	public MergeSort1(int input[]){
		this.data=input;
	}
	
	public void mergeSort()
	{
		sort(data,data.length);
		System.out.println("Sorted array with Merge Sort:");
		for(int input : data)
		{
			System.out.print(" "+input);
		}
		System.out.println("total iteration" + count);
	}
	public void sort(int data[],int size)
	{
		if(size<2)
		{
			return;
		}
		
		int mid=size/2;
		int left[]=new int[mid];
		int right[]=new int[size-mid];
		
		for(int i=0; i<mid ;i++)
		{
		 left[i] = data[i];
		}
		
		for ( int i=mid; i<size;i++)
		{
			right[i-mid]=data[i];
		}
		
		
		sort(left,left.length);
		sort(right,right.length);
		merge(data, left, right, left.length, right.length);
	}
	
	public  void merge(
	
			  int[] a, int[] l, int[] r, int left, int right) {
		count++;
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}
	
}
