package codelearn;

import java.util.Stack;

public class RegularBracketSequence {

  public static void main(String[] args) {
    System.out.println(regularBracketSequence("(((()))"));
    new Character('c');
  }

  public static boolean regularBracketSequence(String sequence) {
    Character[] chars = sequence.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    Stack<Character> stack = new Stack<>();
    for (Character c: chars) {
      if (c.equals('(')) {
        stack.push(c);
      }
      if (c.equals(')')) {
        if (!stack.empty() && stack.peek().equals('(')) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.empty();
  }

}
