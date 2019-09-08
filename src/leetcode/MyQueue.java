package leetcode;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> stack1 = new Stack<>();
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        stack.push(x);
        while (!stack1.isEmpty()) {
            stack.push(stack1.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();

    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
    }
}
