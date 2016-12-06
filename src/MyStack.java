import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 225. Implement Stack using Queues
 * https://leetcode.com/problems/implement-stack-using-queues/
 */
public class MyStack {
    private Queue<Integer> myStack = new LinkedList<>();

    //Push element x onto stack.
    public void push(int x) {
        int size = myStack.size();
        myStack.add(x);
        while (size > 0) {
            myStack.add(myStack.remove());
            size--;
        }
    }

    //Removes the element on top of the stack.
    public void pop() {
        myStack.remove();
    }

    //Get the top element.
    public int top() {
        return myStack.peek();
    }

    //Return whether the stack is empty.
    public boolean empty() {
        return myStack.isEmpty();
    }
}
