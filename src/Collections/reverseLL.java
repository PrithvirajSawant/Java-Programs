package Collections;
//Reversing a list without using another list
public class reverseLL {
	Node head;
	private int size;
	
	reverseLL()
	{
		size=0;
	}
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
			size++;
		}
		
	}
	
	//addFirst
	public void addFirst(int data)
	{
//		size++;
		Node newNode = new Node(data); //Corner case
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//addLast
	public void addLast(int data)
	{
//		size++;
		Node newNode = new Node(data); //corner case
		if(head == null)
		{
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null)
		{
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	//deleteFirst
	public void deleteFirst()
	{
		if(head == null)   // corner case
		{
			System.out.println("The list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
		
	//deleteLast
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("The list is empty");
			return;
		}
		size--;
		if(head.next == null)
		{
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next!=null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	//print
	public void printList()
	{
		if(head == null)  //corner case
		{
			System.out.println("List is Empty");
			return;
		}
		
		Node currNode = head;
		while(currNode!=null)
		{
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("null");
		
	}
	
	//size
	public int getSize()
	{
		return size;
	}
	
	public void reverseIterate()
	{
		if(head == null || head.next == null)  //corner case
		{
			return;
		}
		 					 //eg: {4,5,6,7}
		Node prevNode = head;  // 4
		Node currNode = head.next; // 5
		while(currNode!=null)
		{
			Node nextNode = currNode.next;  // 5->6
			currNode.next = prevNode;  //here currNode.next is pointer of currNode -> & here we change the direction of next node to 4<-5
			
			//Update
			prevNode = currNode; // 5 i.e,we are assigning current node as previous Node.
			currNode = nextNode; // 6 i.e,we are assigning next node as current Node.  
			                     // 
		}
		head.next = null; // 4 will be pointing to null 
		head = prevNode; // 7 will be the new head
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseLL list = new reverseLL();		
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(7);
		System.out.println("Original List : ");
		list.printList();
//		list.deleteFirst();
		System.out.println("Reversed List : ");
		list.reverseIterate();
		list.printList();
		

	}

}
