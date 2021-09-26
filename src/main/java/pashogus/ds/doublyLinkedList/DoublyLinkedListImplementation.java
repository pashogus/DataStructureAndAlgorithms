package pashogus.ds.doublyLinkedList;




public class DoublyLinkedListImplementation {


	/**
	 * in first iteration , it will be null , so we will add date and make the next filed as null
	 * in second iteration, it is not null, so get the next reference from head node 
	 *        and iterate through nodes till finding the node with next value as null , 
	 *        and add next value as newly created node  and return the object.
	 * 
	 */
	Node head;
	
	public static void main(String[] args) {
	
		DoublyLinkedListImplementation doublyLinkedListObject = new DoublyLinkedListImplementation();
		DoublyLinkedListImplementation.insert(doublyLinkedListObject, 2);
		DoublyLinkedListImplementation.insert(doublyLinkedListObject, 5);
		DoublyLinkedListImplementation.insert(doublyLinkedListObject, 8);
		DoublyLinkedListImplementation.insert(doublyLinkedListObject, 9);
		DoublyLinkedListImplementation.printValues(doublyLinkedListObject);
		DoublyLinkedListImplementation.delete(doublyLinkedListObject, 2);
		DoublyLinkedListImplementation.printValues(doublyLinkedListObject);
		DoublyLinkedListImplementation.delete(doublyLinkedListObject, 8);
		DoublyLinkedListImplementation.printValues(doublyLinkedListObject);
	}
	
	
	public static DoublyLinkedListImplementation insert(DoublyLinkedListImplementation doublyLinkedListObject , int data)
	{
		//Creating new node , and making the next reference as null
		Node newNode = new Node(data);
		
		
		//setting up the head node.
		if(doublyLinkedListObject.head ==null)
		{
			doublyLinkedListObject.head=newNode;
		}
		
		//if not end node, need to traverse the the end node and add link the newly created node
		//and the next reference of the newly created node is null as we setting to null 
		else
		{
			Node last = doublyLinkedListObject.head;
			//this loop is to identify the last item in the list
			while (last.next !=null)
			{
				last =last.next;
			}
			last.next=newNode;
			newNode.prev=last;
		}
		
		return doublyLinkedListObject;
	
	}
	
	
   public static void printValues(DoublyLinkedListImplementation linkedListObject)
   {
	   //getting the current node
	   Node currentNode = linkedListObject.head;
	   System.out.println("Values are - " );
	   while(currentNode !=null)
	   {
		   //printing the data from the current node
		   System.out.println(currentNode.data );
		   //assigning the next node 
		   currentNode=currentNode.next;
	   }
   }
   
   public static DoublyLinkedListImplementation delete(DoublyLinkedListImplementation listObject, int key)
   {
	   
	   Node currentNode = listObject.head;
	   Node previousNode = null;
	   
	   //if it is head node, we can\t able to change the next node by any means , just by changign the head node
	   //is sufficient to remove the head node form list. 
	   
	   //in this case current node is head node and if the key matches, then we can point next node as Head
	   if(currentNode != null && currentNode.data== key)
	   {
		  // currentNode.prev=null;
		   listObject.head=currentNode.next;
		   System.out.println("Head Value after removal of  Head node " + currentNode.data);
		   
		  // no need for this, it will throw an unwanted messages in the last condition ,node is not found
		   //currentNode=currentNode.next;
		  
		   listObject.head.prev=null;
		   return listObject;
		   
		  
	   }
	   
	
	   //if key not matches, iterate and get the node matching key
	   while(currentNode != null && currentNode.data != key)
	   {
		   previousNode=currentNode;
		   currentNode=currentNode.next;
	   }
	
	   //sure it will be an node which needs to be deleted , as we identified from the previous while loop
	   //and changing the link of previosu node to next node of the current noe
	if(currentNode !=null)
	{
		System.out.println("Node "+currentNode.data + " is deleted");
		previousNode.next=currentNode.next;	
		
	}
	
	if(currentNode ==null)
	{
		System.out.println("Node is not found");

	}
	
	
	return listObject;
	   
   }
   
   

}
