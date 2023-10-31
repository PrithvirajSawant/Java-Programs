package Collections;

public class Stack_ArrayList_ <T>{
	Object a[];
	int index;
	int size;
	int count = 0;
	
	Stack_ArrayList_()
	{
		size = 10;
		index=-1;
		a = new Object[size];
	}
	
	public boolean isEmpty()
	{
		return index == -1;
	}
	
	public void push(T data)
	{
		count++;
		if(index==size-1)
		{
//			System.out.println("Stack full");
//			return;
			Object b[] = new Object[size]; //we need to pass size over here, if we pass index it will not print 9th index element - it will print null.
			for(int i=0;i<=index;i++)b[i]=a[i];
			size=size*3/2 +1;
			a = new Object[size];
			for(int i=0;i<=index;i++)a[i]=b[i];
		}

		index++;
		a[index]=data;
	}
	
	public T pop()
	{
		if(isEmpty())
		{
			System.out.println("Empty Stack");
		}
		
		count--;
		Object top = a[index];
		index--;
		return (T)top;
	}
	
	public T peek()
	{
		if(isEmpty())
		{
			System.out.println("Empty Stack");
		}
		return (T)a[index];
	}
	
	public int actualSize()
	{
		return  size;
	}
	
	public int Size()
	{
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_ArrayList_<Integer> s = new Stack_ArrayList_<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(15);
		s.push(16);
		s.push(17);
//		s.pop();
//		System.out.println(s.peek());
		System.out.println("Current size is "+s.Size());
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		System.out.println("Current size is "+s.Size());
		System.out.println("Array size increased by "+s.actualSize());

	}

}
