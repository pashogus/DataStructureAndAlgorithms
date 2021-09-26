package pashogus.ds.stack;

public class StackImplemtationWithLinkedList {

	//reference for top node, update this node for every addition of new node
	   Node top;
	
	public class Node
	{
	int data;
	Node nextNode;
	
	public Node(int data)
	{
		this.data=data;
		this.nextNode=null;
	}
		
	}
	
	
	public static void main(String[] args) {
		StackImplemtationWithLinkedList stack = new StackImplemtationWithLinkedList();
      
		System.out.println(stack.isEmpty());
		stack.peek();
		stack.pop();
		stack.push(56);
      stack.push(23);
      stack.pop();
      stack.push(24);
      stack.push(45);
          stack.print(); 
          System.out.println(stack.isEmpty());
              
             
             
		
	}
	
	public  void push(int data)
	{
		Node newNode = new Node(data);
		//if the top node is null, then we are going to add new node as top node 
		if(this.top == null)
		{	
			System.out.println("Adding top node :"+ newNode.data);
		this.top=newNode;
		}
		
		//in else case, updating the top node a newly created node and adding the next element of the top node to the 
		//previous top node
		else
		{
			newNode.nextNode=this.top;
			this.top=newNode;
			System.out.println("Updating top node :"+ this.top.data);
//			Node previousNode = this.top;		
//			this.top=newNode;
//			this.top.nextNode=previousNode;
		}
		
		
		/**
		 *  Node temp = new Node();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
		 */
	}
	
	
	public void print()
	{
		Node currentNode=this.top;
		System.out.println(currentNode.data);
		while(currentNode.nextNode!=null)
		{
			currentNode=currentNode.nextNode;
			System.out.println(currentNode.data);
		}
	}
	
	public void pop()
	{
		//Before removing checking if stack is empty are not , we can even call the isEmpty method from here
		if(this.top==null)
		{
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Removing node :" +this.top.data);
		//just updating the top node
		this.top=top.nextNode;
	}
	
	public boolean isEmpty()
	{
		if(this.top==null)
		{
			return Boolean.TRUE;
		}
		else
		{
			return Boolean.FALSE;
		}
		//return this.top==null;
	}
	
	public void peek()
	{
		if(!isEmpty())
				{
			System.out.println(this.top.data);
				}
		else
		{
			System.out.println("Stack is empty ");
		}
	}
	

}
