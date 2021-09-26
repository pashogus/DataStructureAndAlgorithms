package pashogus.search;

public class Search {

	public static void main(String[] args) {
		

				int array[]={20,30,50,60,67,83,96};
				RecursiveBinarySearch binarySearch= new RecursiveBinarySearch(array,68);
				if(Boolean.TRUE.equals(binarySearch.binarySearch()))
						{
					System.out.println("Element Found");
						}
				else
				{
					System.out.println("Element Not Found");
				}
				
				
				

			}
			


}
