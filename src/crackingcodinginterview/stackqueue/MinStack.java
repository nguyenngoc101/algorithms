package crackingcodinginterview.stackqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack extends Stack<Integer> {

    // push , pop ,min is O(1)
    private Stack<Integer> minStack = new Stack<>();


    public Integer pop() {
        minStack.pop();
        return super.pop();
    }

    public Integer push(Integer ele) {

        if (minStack.size() == 0 || ele <= minStack.peek()) {
            minStack.push(ele);
        } else {
            minStack.push(minStack.peek());
        }
        return super.push(ele);
    }

    public Integer min() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        StackWithMin2 stack = new MinStack.StackWithMin2();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.min());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
    }


    public static class StackWithMin2 extends Stack<Integer> {
        Stack<Integer> s2;
        public StackWithMin2() {
            s2 = new Stack<Integer>();
        }
        public void push(int value){
            if (value <= min()) {
                s2.push(value);
            }
            super.push(value);
        }
        public Integer pop() {
            int value = super.pop();
            if (value == min()) {
                s2.pop();
            }
            return value;
        }

        public int min() {
            if (s2.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return s2.peek();
            }
        }
    }
}


