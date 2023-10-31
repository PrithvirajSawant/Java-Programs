package Collections;

public class Linkedlist_double {
	Node head;
	int size;
	
	Linkedlist_double()
	{
		size=0;
	}
	class Node
	{
		int data;
		Node next;
		Node prev;
		
//		Node(int data)
//		{
//			this.data=data;
//		}
		
		Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	public void firstInsert(int data)
	{
		size++;
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;	
			return;
		}
		newNode.next=head;
//		newNode.prev=null;  // not mandatory
		head.prev=newNode;
		head=newNode;
		
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		Node currNode = head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+"<->");
			currNode=currNode.next;
		}
		System.out.println("null");
		
	}
	
	public int Size()
	{
		return size;
	}
	
	public int set(int index,int data)
	{
		if(index<0 || index>=size)
		{
			System.out.println("Invalid Index");
		}
		Node currNode = head;
		int currIdx = 0;
		while(currNode!=null)
		{
			if(currIdx==index)
			{
				currNode.data=data;
				return currNode.data;
			}
			currNode=currNode.next;
			currIdx++;
		}
		return 0;
	}
	
	public int get(int index)
	{
		if(index<0 || index>=size)
		{
			System.out.println("Invalid Index");
		}
		int currIdx = 0;
		Node currNode = head;
		while(currNode!=null)
		{
			if(currIdx==index)
			{
				return currNode.data;
			}
			currIdx++;
			currNode=currNode.next;
		}
		return 0;
	}
	
	public void remove(int index)
	{
		if(index<0 || index>=size)
		{
			System.out.println("Invalid Index");
			return;
		}
		size--;
		if(index==0)
		{
			head=head.next;
			return;
		}
		int currIdx=0;
		Node prevNode = null;
		Node currNode = head;
		while(currIdx<index)
		{
			prevNode=currNode;
			currNode=currNode.next;
			currIdx++;
		}
		Node Next = currNode.next;
		prevNode.next=Next;
		Next.prev=prevNode;
		
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
	
	public void add(int index,int data)
	{
		if(index<0 || index>size )
		{
			System.out.println("Invalid index");
			return;
		}
		
		Node newNode = new Node(data);
		int currIdx=0;
		if(index==0)
		{
			size++;
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			return;
		}
		
		Node prevNode = null;
		Node currNode = head;
		while(currIdx<index)
		{
			prevNode=currNode;
			currNode=currNode.next;
			currIdx++;
		}
		prevNode.next=newNode;
		newNode.prev=prevNode;
		
		newNode.next=currNode;
		
		if(index<size)
		{
			currNode.prev=newNode;
		}
		
		
		size++;
	}
	
	public void reverseCheck()
	{
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		Node currNode = head;
		while(currNode.next!=null)
		{
			currNode=currNode.next;
		}
		while(currNode!=head)
		{
			System.out.print(currNode.data+"<->");
			currNode=currNode.prev;
		}
		System.out.print(currNode.data+"<->");
		System.out.println("null");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist_double list = new Linkedlist_double();
		//insert
		list.firstInsert(7);
		list.firstInsert(6);
		list.firstInsert(5);
		list.firstInsert(4);
		//display
		list.display();
		System.out.println();
		//size
		System.out.println("\n"+list.Size()+" Curr size");
//		//get()
//		System.out.println(list.get(4));
//		//remove
//		list.remove(1);
		list.remove(2);
		System.out.println("\n"+list.Size()+" Curr size");
//		list.remove(1);
		list.display();
		System.out.println("\nReverse itterate:");
		list.reverseCheck();
//		list.clear();
		System.out.println("******");
		list.display();
//		list.reverseCheck();
//		System.out.println("\n"+list.Size()+" Curr size");
		System.out.println();
		//add()
		list.add(0, 1);
		list.add(2, 21);
		list.add(4, 10);
		list.add(5, 13);
		list.display();
		System.out.println();
		list.reverseCheck();
		System.out.println(list.Size()+" Curr size");
		//set()
		list.set(0, 0);
		list.set(2, 45);
		list.set(6, 89);
		list.set(7, 89);
		list.set(-1, 89);
		list.display();
		System.out.println(list.set(0, 3));
		list.display();


	}

}
