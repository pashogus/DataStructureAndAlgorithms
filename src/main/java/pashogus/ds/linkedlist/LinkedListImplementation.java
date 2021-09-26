package pashogus.ds.linkedlist;




public class LinkedListImplementation {


	/**
	 * in first iteration , it will be null , so we will add data and make the next field as null
	 * in second iteration, it is not null, so get the next reference from head node 
	 *        and iterate through nodes till finding the node with next value as null , 
	 *        and add next value as newly created node  and return the object.
	 * 
	 */
	Node head;
	
	public static void main(String[] args) {
	
		LinkedListImplementation linkedListObject = new LinkedListImplementation();
		LinkedListImplementation.insert(linkedListObject, 2);
		LinkedListImplementation.insert(linkedListObject, 5);
		LinkedListImplementation.insert(linkedListObject, 8);
		LinkedListImplementation.insert(linkedListObject, 9);
		LinkedListImplementation.printValues(linkedListObject);
		LinkedListImplementation.delete(linkedListObject, 2);
		LinkedListImplementation.printValues(linkedListObject);
		LinkedListImplementation.delete(linkedListObject, 8);
		LinkedListImplementation.printValues(linkedListObject);
	}
	
	
	public static LinkedListImplementation insert(LinkedListImplementation linkedListObject , int data)
	{
		//Creating new node , and making the next reference as null
		Node newNode = new Node(data);
		newNode.next = null;
		
		//setting up the head node.
		if(linkedListObject.head ==null)
		{
			
			linkedListObject.head=newNode;
		
		}
		
		//if not end node, need to traverse the the end node and add link the newly created node
		//and the next reference of the newly created node is null as we setting to null 
		else
		{
			//note : if it is stack, no need to traverse till end node , as stack will add/remove node only in the top/head
			//just update the top node as newly created node and update the next link to the current top node
			Node last = linkedListObject.head;
			while (last.next !=null)
			{
				last =last.next;
			}
			last.next=newNode;
		}
		
		return linkedListObject;
	
	}
	
	
   public static void printValues(LinkedListImplementation linkedListObject)
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
   
   public static LinkedListImplementation delete(LinkedListImplementation linkedListObject, int key)
   {
	   
	   Node currentNode = linkedListObject.head;
	   Node previousNode = null;
	   
	   //if it is head node, we can\t able to change the next node by any means , just by changing the head node
	   //is sufficient to remove the head node form list. 
	   
	   //in this case current node is head node and if the key matches, then we can point next node as Head
	   if(currentNode != null && currentNode.data== key)
	   {
		   linkedListObject.head=currentNode.next;
		   System.out.println("Head Value after removal of  Head node " + currentNode.data);
			return linkedListObject;
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
	
	
	return linkedListObject;
	   
   }
   
   

}
