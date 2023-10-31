package Collections;

public class queue_LinkedList {
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	static class Queue
	{
		static Node head = null;
		static Node tail = null;
		
		public static boolean isEmpty()
		{
			return head == null && tail == null;
		}
		
		//enqueue
		public static void add(int data)
		{
			Node newNode = new Node(data);
			//If empty
			if(tail == null)
			{
				tail = head = newNode;
				return;
			}
			//if not empty
			tail.next = newNode;
			tail = newNode;
		}
		
		//dequeue
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			
			
			int front = head.data;
			//for single element
			if(head == tail)
			{
				tail = null;
			}
			// multiple element
			head = head.next;
			return front;
		}
		
		//peek
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			
			int front = head.data;
			return front;
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue q = new Queue();
		Queue.add(1);
		Queue.add(2);
		Queue.add(3);
		Queue.add(4);
		Queue.add(5);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		q.add(5);
//		q.add(6);
		
		while(!Queue.isEmpty())
		{
			System.out.println(Queue.peek());
			Queue.remove();
		}

	}

}
