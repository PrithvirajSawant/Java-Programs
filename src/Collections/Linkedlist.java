package Collections;
//L-1
public class Linkedlist {
	Node head; //reference node (starting point or entry point)
	private int size;
	
	Linkedlist()
	{
		size=0;
	}
	
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			next=null;
			size++; // Size for addFirst & addLast
		}
		
	}
	
	//addFirst //Useful in stack LIFO
	public void addFirst(String data)
	{
//		size++;
		Node newNode = new Node(data); //Corner case
		if(head == null)  // if no prior Node exist
		{
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//addLast FIFO
	public void addLast(String data)
	{
//		size++; //Node Constructor 
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
		if(head.next == null) // if only one element is present
		{
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next!=null)
		{
			secondLast = lastNode;
			lastNode = lastNode.next;
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
	
	public String get(int index)
	{
//		if(index<0 || index>=size)
//		{
//			return null;
//		}
		Node currNode = head;
		int currIdx = 0;
		while(currNode!=null)
		{
			if(currIdx == index)
			{
				return currNode.data;
			}
			currNode = currNode.next;
			currIdx++;
		}
		return null;
	}
	
	public void set(int index, String data)
	{	
		if(index>=size)
		{
			System.out.println("Invalid Index");
			return;
		}
		
		int currIdx = 0;
		Node currNode = head;
		while(currNode!=null)
		{
			if(currIdx==index)
			{
				currNode.data=data;
				return;
			}
			currNode = currNode.next;
			currIdx++;
		}
		
	}
	
	public void remove(int index)
	{
		
		if(index>=size)
		{
			System.out.println("invalid index");
//			throw new NullPointerException();
			return;
		}
		size--;
		if(index==0)
		{
			head=head.next;
			return;   //if not used - Cannot assign field "next" because "previous" is null
		}
		Node previous = null;
		Node currNode = head;
		int currIdx = 0;
		while(currIdx<index)
		{
			previous=currNode;
			currNode=currNode.next;
			currIdx++;
		}
		previous.next=currNode.next;

	}
	
	public void clear()
	{
		
		Node currNode = head;
		while(currNode!=null)
		{
			currNode=currNode.next;
//			size--;
		}
		head=currNode;
		size=0;
		
	}
	
	
	public void add(int index,String data)
	{
		
		if(index<0||index>size)
		{
			System.out.println("Invalid Index");
			return;
		}
//		size++;
		//If it is the first element
		Node newNode = new Node(data);
		if(index==0)
		{
			newNode.next = head;
			head=newNode;
			return;
		}
		
		Node prevNode = null;
		Node currNode = head;
		int currIdx = 0;
		while(currIdx<index)
		{
			prevNode = currNode;
			currNode = currNode.next;
			currIdx++;
		}
		prevNode.next = newNode;
		newNode.next = currNode;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist list = new Linkedlist();		
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addLast("List");
		list.printList();
		
		list.addFirst("This");
		list.printList();
		list.remove(2);
		list.printList();
//		list.clear();
//		list.printList();
		
//		System.out.println("Current size is "+list.getSize());
//		list.set(3, "Linkedlist");
//		list.printList();
//		
//		list.add(0, "etc");
//		list.add(4, "blank");
//		list.add(5, "Form");
//		list.printList();
//		System.out.println(list.get(4));
//		list.add(4, "nn");
//		list.printList();
//		System.out.println(list.get(4));
//		list.printList();
//		list.add(0, "ww");
//		list.printList();
////		list.deleteFirst();
////		list.printList();
////		
////		list.deleteLast();
////		list.printList();
////		System.out.println("Current size is "+list.getSize());
////		System.out.println("Element @ specfied index is : "+list.get(1));
//		
////		list.printList();
////		System.out.println("Current size is "+list.getSize());
////		
////		list.printList();
////		System.out.println("Current size is "+list.getSize());
////		list.set(0, "er");
//		System.out.println(list.getSize());
//		list.remove(0);
//		list.add(0, "j0");
//		list.add(0, "j0");
//		list.add(10, "j10");
//		list.add(11, "j11");
//		list.remove(11);
//		list.printList();
//		System.out.println(list.getSize());
////		list.clear();
		
		
	}

}
