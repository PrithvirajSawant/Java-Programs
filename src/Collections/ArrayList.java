package Collections;

public class ArrayList<T> {
	Object arr[];
	int s;
	int size;
	
	ArrayList()
	{
		size = 10;
		s = -1; //index
		arr = new Object[size];
	}
	
//	ArrayList(int data)    //Optional Constructor : to define the size explicitly 
//	{
//		size = data;
//		s = -1;
//		arr = new Object[size];
//	}
	
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
	
	T get(int data)  //get - to get the element @ that index.
	{
		return (T) arr[data];
	}
	
	int size()
	{
		return s;
	}
	
	boolean isEmpty()
	{
		return s == -1;
		
	}
	
	int currSize()
	{
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.isEmpty());
		System.out.println("Current size is "+list.size());
		
		for(int i=1;i<16;i++)list.add(i); // Exceeding 10 will result in the array size as 16
		
//		list.add("jom");
//		list.add(4567.1);
		
		System.out.println("Current size is "+list.size());
		System.out.println("Explicetly defined size is "+list.currSize());
		
		list.add(20);
		list.add(30); //This , 17 addition will cause the size to become 25
		list.add(40);

		for(int i=0;i<list.size-1;i++)System.out.println(list.get(i)); 
		System.out.println("Explicetly defined size is "+list.currSize());
		System.out.println(list.isEmpty());
	}

}
