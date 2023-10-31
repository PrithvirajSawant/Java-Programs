package Collections;

import java.util.Stack;

public class push_Bottom_of_stack {

	public static void pushAtBottom(int data, Stack<Integer> s) {

		if (s.isEmpty()) {
			s.push(data);
//			System.out.println(s.push(data)); // 2
			return;
		}
		int top = s.pop();
//		System.out.println(top);
//		System.out.println("************");
		pushAtBottom(data, s); // 1 : First all three elements will be removed until the stack is empty
//		System.out.println(top);
		s.push(top);          // 3 : after the 
//		System.out.println(s.push(top));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);

		pushAtBottom(4, s);

		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}

	}

}

// Recursion Explanation

// the recursion returns after the base case condition is met. The base case is when the stack s is empty. When the stack becomes empty, the data element is pushed onto the stack directly, and then the method returns. In this context, "returning" means that the execution of the current recursive call stops and control goes back to the previous level of the recursion.

// To provide more clarity, let's step through the process:

//1. The function is called initially with some data and a non-empty stack s.
//2. The top element of the stack is removed and stored in the variable top.
//3. A recursive call is made to pushAtBottom(data, s) with the modified stack (without the top element).
//4. The recursive call proceeds similarly, removing elements from the top and pushing the data element to the bottom.
//5. Eventually, a recursive call reaches a point where the stack becomes empty.
//6. In this base case, the data element is pushed onto the empty stack.
//7. After the base case completes, control returns to the previous level of recursion.
//8. At this point, the removed top element (from the previous level) is pushed back onto the stack using s.push(top);.
//9. The same process repeats for each level of recursion until all recursive calls complete.
//10. In summary, the recursion returns after the base case is met, and it returns from each level of the recursion as the control unwinds back to the initial call. The line s.push(top); is executed as control returns to each previous level of the recursion, ensuring that the removed elements are pushed back in the correct order.





