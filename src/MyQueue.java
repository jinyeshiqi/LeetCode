import java.util.Stack;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 232. Implement Queue using Stacks
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class MyQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    int front;

    //Push element x to the back of queue.
    public void push(int x) {
        if (stack1.isEmpty()) {
            front = x;
        }
        stack1.push(x);
    }

    //Removes the element from in front of queue.
    public void pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }

    //Get the front element.
    public int peek() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        return front;
    }

    //Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
