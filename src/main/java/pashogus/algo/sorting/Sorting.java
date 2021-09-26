package pashogus.algo.sorting;

public class Sorting {

	public static void main(String[] args) {


		//int data[] = {10,20,50,6,8,70,100,2,1,78,1,56,89,4};
		int data[] = {20,10,50,6,42};
		//Big O complexity n^2
//		BubbleSort bubbleSort = new BubbleSort(data);
//		bubbleSort.bubbleSort();
//		System.out.println();
//		//Big O complexity n^2
//		SelectionSort selectionSort = new SelectionSort(data1);
//		selectionSort.selectionSort();
//		System.out.println();
//		QuickSort quickSort = new QuickSort(data2);
//		quickSort.quickSort();
//		System.out.println();
		MergeSort1 mergeSort = new MergeSort1(data);
		mergeSort.mergeSort();
		
	}

}
