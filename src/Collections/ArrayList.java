package Collections;

public class ArrayList<T> {
	Object arr[];
	int s;
	int size;
	
	ArrayList()
	{
		size = 0;
		s = -1; //index
		arr = new Object[size];
	}
	
//	ArrayList(int data)    //Optional Constructor : to define the size explicitly 
//	{
//		size = data;
//		s = -1;
//		arr = new Object[size];
//	}
	
	boolean isEmpty()
	{
		return s == -1;
		
	}
	
	void add(T data)
	{
		if(s==size-1)  //imp
		{
			Object brr[] = new Object[size];
			for(int i=0;i<=s;i++)brr[i]=arr[i];
			size = size*3/2 +1; //Update/Increase the size of the array
			arr = new Object[size];
			for(int i=0;i<=s;i++)arr[i]=brr[i];
		}
		s++;
		arr[s] = data;
	}
	
	
	
	T get(int index)  //get - to get the element @ that index.
	{
		
		return (T) arr[index];
	}
	
	void set(int index, T data)
	{
		if(isEmpty())
		{
			System.out.println("Empty list");
			return;
		}
		else if(index<0||index>=size())
		{
			System.out.println("Invalid Index");
			return;
		}
		arr[index]=data;
	}
	
	void remove(int index)
	{
		if(isEmpty())
		{
			System.out.println("Empty list");
			return;
		}
		else if(index<0||index>=size())
		{
			System.out.println("Invalid Index");
			return;
		}
		
		for(int i=index;i<s;i++)
		{
			arr[i]=arr[i+1]; //Shifting the elements to the left
		}
		s--;
	}
	
	void add(int index, T data)
	{
		if(index<0 || index>size())
		{
			System.out.println("Invalid Index");
			return;
		}
		if(s==size-1)  //imp
		{
			Object brr[] = new Object[size];
			for(int i=0;i<=s;i++)brr[i]=arr[i];
			size = size*3/2 +1; //Update/Increase the size of the array
			arr = new Object[size];
			for(int i=0;i<=s;i++)arr[i]=brr[i];
		}
		
		for(int i=s+1;i>index;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[index]=data;
		s++;
	}
	
	void clear()
	{
		for(int i=0;i<=s;i++)
		{
			arr[i]=null;
		}
		s=-1;
		size=0;
	}
	
	
	int size() // real deal - as defined in the collections 
	{
		return s+1; // the s (index) remains unchanged only the returned value is changed
	}
	
	
	int currSize() //* just to understand (how size expands/works)
	{
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>();
		System.out.println(list.isEmpty());
		System.out.println("size = "+list.size());
		
		int val=1;
		for(int i=0;i<1;i++)list.add(val++); // Exceeding 10 will result in the array size as 16
		
//		list.add("jom");
//		list.add(4567.1);
		
		System.out.println("size1 = "+list.size());
		System.out.println("Explicetly defined size is "+list.currSize());
		list.remove(0);
		
//		list.add(20);
//		list.add(30); //This , 17 addition will cause the size to become 25
//		list.add(40);
//		
//		list.remove(12);
//		list.add(5, 22);
		for(int i=0;i<list.size;i++)System.out.println(list.get(i)); 
		
		System.out.println("size2 = "+list.size());
		System.out.println("Explicetly defined size is "+list.currSize());
		
		list.clear();
		System.out.println("size2 = "+list.size());
		System.out.println("Explicetly defined size is "+list.currSize());
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		System.out.println("size2 = "+list.size());
		System.out.println("Explicetly defined size is "+list.currSize());
		
//		System.out.println(list.isEmpty());
//		list.remove(0);
//		list.remove(3);
////		System.out.println(list.s);// the s (index) remains unchanged only the returned value is changed 
//		System.out.println("size3 = "+list.size());
//		for(int i=0;i<list.size-1;i++)System.out.println(list.get(i)); 
//		System.out.println("Explicetly defined size is "+list.currSize());
//		list.set(0, 96);
//		for(int i=0;i<list.size-1;i++)System.out.println(list.get(i)); 
//		System.out.println("size4 = "+list.size());
//		
//		list.add(2, 39);
//		for(int i=0;i<list.size-1;i++)System.out.println(list.get(i));
//		System.out.println("size4 = "+list.size());
//		
//		list.clear();
//		for(int i=0;i<list.size-1;i++)System.out.println(list.get(i));
//		System.out.println("size5 = "+list.size());
//		System.out.println("Explicetly defined size is "+list.currSize());
//		
//		System.out.println("*****************");
//		for(int i=1;i<18;i++)list.add(i);
//		for(int i=0;i<list.size-1;i++)System.out.println(list.get(i));
//		System.out.println("size5 = "+list.size());
//		System.out.println("Explicetly defined size is "+list.currSize());
		

		
		
		
		
	}

}
