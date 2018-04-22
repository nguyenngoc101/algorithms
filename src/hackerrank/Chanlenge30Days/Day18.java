package hackerrank.Chanlenge30Days;

import java.util.LinkedList;
import java.util.Stack;

public class Day18 {

    public class Solution {

        private Stack<Character> stack = new Stack();
        private LinkedList<Character> queue = new LinkedList();

        public void pushCharacter(char ch) {
            stack.push(ch);
        }

        public void enqueueCharacter(char ch) {
            queue.add(ch);
        }

        public char popCharacter() {
            return stack.pop();
        }

        public char dequeueCharacter() {
            return queue.remove();
        }
    }
}
