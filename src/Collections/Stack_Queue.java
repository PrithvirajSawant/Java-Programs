package Collections;
// Implementation of Stack using Queue
import java.util.LinkedList;
import java.util.Queue;

public class Stack_Queue {
	int size = 0 ;
//	Stack_Queue()
//	{
//		size=0;
//	}
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	
	public void pushh(int data)
	{
		size++;
		q1.offer(data);
	}

	
	public int peek()
	{
		if(q1.isEmpty())
		{
			return -1;
		}
		while(q1.size()!=1)
		{
			q2.offer(q1.poll());
		}
		
		int val = q1.peek();
		return val;
	}
	
	public int size()
	{
		return size;
	}
	
	
	public int popp()
	{
		if(q1.isEmpty())
		{
			return -1;
		}
		size--;
		while(q1.size()!=1)
		{
			q2.offer(q1.poll()); //or q1.remove() ||  poll is better than remove & offer > add
		}
		
		int val = q1.poll();  //***
		
		Queue<Integer> temp = q1; //q1 is empty at this moment
		q1=q2; //again we are putting all the elements into q1 from q2 / making q1 as q2
		q2=temp; //and we are making q2 empty
		
		return val;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_Queue a = new Stack_Queue();
		
		a.pushh(7);
		a.pushh(3);
		a.pushh(4);
		
//		System.out.println(a.popp()); //4
//		System.out.println(a.popp()); //3
		
		a.pushh(5);
		System.out.println("Peek "+a.peek());
		System.out.println("Peek "+a.peek());
		System.out.println("Peek "+a.peek());
		System.out.println("********");		
		System.out.println(a.size()+" Curr size");

		System.out.println(a.popp()+" popped"); //5 popped
//		a.pushh(9);
		System.out.println("Peek "+a.peek());
		System.out.println("*********");
		System.out.println(a.popp()); //4
		System.out.println(a.popp()); //3
		System.out.println(a.popp()); //7
		System.out.println(a.popp()); // returns -1 as the stack is empty
		System.out.println(a.size()+" Curr size");
	}

}
