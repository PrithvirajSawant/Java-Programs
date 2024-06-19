package Collections;
// Queue using Array
public class Queue {
	static class queue
	{
		static int arr[];
		static int size;
		static int rear;
		
		queue(int size)
		{
			queue.size=size; //accessing in a static way
			rear = -1;
			arr = new int[size];  //this keyword is not mandatory , as it is declared as static
		}
		
		public static boolean isEmpty()
		{
			return rear == -1;
		}
		
		//enqueue / add - O(1)
		public static void add(int data)
		{
			if(rear == size-1)
			{
				System.out.println("Full Queue");
				return;
			}
			rear++;
			arr[rear] = data;
		}
		
		//dequeue / remove - O(n)
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return -1;
			}
			int front = arr[0];
			for(int i=0;i<rear;i++)
			{
				arr[i] = arr[i+1];
			}
			rear--;
			return front;
		}
		
		//peek
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return -1;
			}
			
			int front = arr[0];
			return front;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q = new queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.remove());
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}

	}

}
