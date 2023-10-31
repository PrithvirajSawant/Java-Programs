package Collections;

public class Stack_Array {
	int a[];
	int top;
	int size;
	public Stack_Array(int size)
	{
		this.size=size;
		top=-1;
		a = new int[size];
	}
	
	boolean isEmpty()
	{
		return top==-1;
	}
	
	void push(int data)
	{
		if(top==size-1) //Overflow - completely filled & we are trying to add an element.
		{
			return;
		}
		top++;
		a[top] = data;
	}
	
	int pop()
	{
		if(isEmpty())  // or isEmpty() //Underflow - when are stack is empty & we are trying to retrieve an element.
		{
			System.out.println("Empty Stack");
		}
		int res = a[top];
		top--;
		return res;
		
	}
	
	int peek()
	{
		if(isEmpty()) //or top==-1
		{
			return -1;
		}
		return a[top];
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_Array s = new Stack_Array(3);
		s.push(1);
		s.push(2);
		s.push(3);
//		s.pop()
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}

	}

}
