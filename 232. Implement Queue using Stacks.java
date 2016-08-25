//  beat 94%


import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue 
{
	Deque<Integer> stack1 = new ArrayDeque<Integer>();//in
	Deque<Integer> stack2 = new ArrayDeque<Integer>();//out
	
    // Push element x to the back of queue.
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(stack2.isEmpty()){
        	while(!stack1.isEmpty())
        	{
        		stack2.push(stack1.pop());
        	}
        }
        stack2.pop();
    }

    // Get the front element.
    public int peek() {
    	 if(stack2.isEmpty()){
         	while(!stack1.isEmpty())
         	{
         		stack2.push(stack1.pop());
         	}
         }
        return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}