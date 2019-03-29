package codelearn;

import java.util.ArrayList;
import java.util.List;

public class WordBoggle {

  public static void main(String[] args) {

  }

  public static String[] wordBoggle(String[] board, String[] words) {
    List<String> matchedWords = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        position(i, j, new boolean[board.length][board.length], "");
      }
    }
    return null;
  }

  public static void position(int i, int j, boolean[][] visited, String curWord) {

  }

}
