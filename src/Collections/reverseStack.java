package Collections;

import java.util.Stack;

//using recursion 
public class reverseStack {
	
	//To Push the data (i.e, desired) elements at bottom
	public static void pushAtBottom(int data,Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data,s);
		s.push(top);
	}
	
	// Reverse
	public static void reverse(Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int top = s.pop();
		reverse(s);
		pushAtBottom(top,s); // top variable : is the data we need to push at bottom
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		reverse(s);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}

	}

}
