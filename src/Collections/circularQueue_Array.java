package Collections;

public class circularQueue_Array {
	static class queue
	{
		static int arr[];
		static int size = 10;
		static int rear;
		static int front;
		
		queue(int n)
		{
			size = n;
			rear = -1;
			front = -1;
			arr = new int[size];
		}
		
		public static boolean isEmpty()
		{
			return rear == -1 && front == -1;
		}
		
		public static boolean isFull()
		{
			return (rear+1)%size == front;
		}
		
		//enqueue - O(1)
		public static void add(int data)
		{
			if(isFull())
			{
				System.out.println("Full Queue");
				return;
			}
			//add 1st element
			if(front == -1)
			{
				front = 0;
			}
			rear = (rear+1)%size;
			arr[rear] = data;
		}
		
		//dequeue - O(1)
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			
			int result = arr[front];
			//single element condition
			if(rear == front)
			{
				rear = front = -1;
			}
			else
			{
				front = (front+1)%size;
			}
			return result;
		}
		
		//peek - O(1)
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			
			int result = arr[front];
			return result;
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
		q.remove(); // 1
		q.add(6);
		q.remove(); // 2
		q.add(7);
		q.add(7);  //Full Queue returned
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}

	}

}
