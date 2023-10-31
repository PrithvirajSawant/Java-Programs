package Collections;
//Implementation of Stack using Linked List
public class Stack_LinkedList {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			next = null;
			
		}
	}
	
	 static class Stack
	{
//		public  Node head;
		static int size=0;
		
		public static boolean isEmpty()     //Corner case
		{
			return head == null;
		}
		
		//push()
		public static  void push(int data)
		{
			size++;
			Node newNode = new Node(data);
			if(isEmpty())
			{
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		//pop()
		public static int pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			size--;
			int top = head.data;
			head = head.next; //remove
			return top;
		}
		
		//peek()
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			
			int top = head.data;
			return top;
		}	
		
		//size()
		public static int size()
		{
			return size();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack_LinkedList ss = new Stack_LinkedList(); //if we choose to make the Stack class non-static 
//		Stack_LinkedList.Stack s= ss.new Stack();     //if we choose to make the Stack class non-static 
		Stack.push(1);
		Stack.push(2);
		Stack.push(3);
		Stack.push(4);
		
		System.out.println(Stack.size+" curr size");
		
		while(!Stack.isEmpty())
		{
			System.out.println(Stack.peek());
			Stack.pop();
		}
		System.out.println(Stack.size+" curr size");

	}

}
