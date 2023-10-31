package Collections;

public class HashSet {
	
	Node arr[] = new Node[10];
	int count = 0; //to return the size of the set
	
	public class Node
	{
		Object data;
		Node next;
		
		public Node(Object data) {
//			super();
			this.data = data;
			next = null;
		}
		
	}
	
	public boolean add(Object data)
	{
		int index = data.hashCode()%10;
		if(index<0)
		{
			index*=1;
		}
		Node newNode = new Node(data);
		//For first Node of that index
		if(arr[index]==null)
		{
			arr[index] = newNode;
			count++;
			return true;
		}
		//For following Node having same index 
		Node currNode = arr[index];
		Node prevNode = null;
		while(currNode!=null)
		{
			//if same data exist (same data not allowed)
			if(data.equals(currNode.data))return false;
			
			prevNode = currNode;
			currNode=currNode.next;
		}
		prevNode.next = newNode;
		count++;
		return true;
	}
	
	public int size()
	{
		return count;
	}
	
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				Node currNode = arr[i];
				while(currNode!=null)
				{
					System.out.println(currNode.data);
					currNode=currNode.next;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
//		h.add("Java");
//		h.add("Abc");
//		h.add("Zzz");
		h.add(65);
		h.add(93);
		h.add(123);
		h.add(98);
		h.add(75);
		h.add(33);
		h.add(99);
		h.add(100);
		h.add(100);
		System.out.println("Size of arr : "+h.size());
//		System.out.println("*****");
		h.display();
		

	}

}
