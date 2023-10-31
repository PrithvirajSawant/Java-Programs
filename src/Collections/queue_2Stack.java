package Collections;

import java.util.Stack;

public class queue_2Stack {
	static class queue
	{
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();
		
		public static boolean isEmpty()
		{
			return s1.isEmpty();
		}
		
		public static void add(int data)
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			
			s1.push(data);  // we are pushing the data in s1
//			System.out.println(s1.push(data));
			
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
			
		}
		
		//dequeue
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			return s1.pop();
		}
		
		//peek
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			
			return s1.peek();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		queue q = new queue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.peek());
			queue.remove();
		}
	}

}
