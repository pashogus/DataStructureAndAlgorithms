package pashogus.ds.queue;

public class QueueImplemntationLinkedList {
	
	
	QueueNode frontNode;
	QueueNode rearNode;
	
	class QueueNode
	{
		int data;
		QueueNode nextNode;
		
		public QueueNode(int data)
		{
			this.data=data;
			this.nextNode=null;
		}
	}
	
	
	public static void main(String[] args){
		
		QueueImplemntationLinkedList queue = new QueueImplemntationLinkedList();
		queue.enQueue(45);
		queue.enQueue(46);
		queue.enQueue(21);
		queue.deQueue();
		queue.enQueue(25);
		queue.enQueue(28);
		queue.deQueue();
		queue.display();
		
	}
	
	public void enQueue(int data)
	{
		QueueNode newNode = new QueueNode(data);
		
		if(this.frontNode == null && this.rearNode == null)
		{
			System.out.println("Adding first element to Queue :" + newNode.data);
			this.frontNode=this.rearNode=newNode;
		}
		
		else
		{
			System.out.println("Adding new element to the Queue at the Rear :" + newNode.data);
			this.rearNode.nextNode=newNode;
			this.rearNode=newNode;
		}
	}
	
	public void deQueue()
	{
		if(this.frontNode == this.rearNode)
		{
			System.out.println("Queue is Empty");
		}
		System.out.println("Removing element from the Front :"+this.frontNode.data);
		this.frontNode=this.frontNode.nextNode;
		System.out.println("Front Node Post Removal :"+this.frontNode.data );
	}
	
	public void display()
	{
		System.out.println("List of Nodes : ");
		QueueNode current = this.frontNode;
		System.out.println(current.data);
		while(current.nextNode !=null)
		{		
			System.out.println(current.nextNode.data);
			current=current.nextNode;
		}
		
	}

}
