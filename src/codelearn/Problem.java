package codelearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem {

  public static void main(String[] args) {
    int[] chart = {3, 2, 6, 4, 5, 1, 7};
    System.out.println(chartFix(chart));
  }

  public static int MaxLenSubStr(String str) {
    Map<Character, Integer> firstPositionMap = new HashMap<>();
    Map<Character, Integer> lastPositionMap = new HashMap<>();

    Character[] chars =
        str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    for (int i = 0; i < chars.length; i++) {
      firstPositionMap.putIfAbsent(chars[i], i);
      lastPositionMap.put(chars[i], i);
    }

    Integer maxLenSubStr = 1;
    for (Map.Entry<Character, Integer> entry : firstPositionMap.entrySet()) {
      Character key = entry.getKey();
      int length = lastPositionMap.get(key) - firstPositionMap.get(key) + 1;
      if (length > maxLenSubStr) {
        maxLenSubStr = length;
      }
    }
    return maxLenSubStr;
  }

  public static int MaxSubarray(int[] inputArray) {
    int length = inputArray.length;
    int[] maxArr = new int[length];

    maxArr[0] = inputArray[0];
    for (int i = 1; i < length; i++) {
      if (maxArr[i - 1] + inputArray[i] > inputArray[i]) {
        maxArr[i] = maxArr[i - 1] + inputArray[i];
      } else {
        maxArr[i] = inputArray[i];
      }
    }
    int max = Arrays.stream(maxArr).max().getAsInt();
    return max > 0 ? max : 0;
  }

  public static boolean tennisSet(int score1, int score2) {
    if ((score1 == 7 && score2 == 5) || (score1 == 5 && score2 == 7)) {
      return true;
    }

    if ((score1 == 6 && score2 < 5) || (score2 == 6 && score1 < 5)) {
      return true;
    }
    return false;
  }


  public static int chartFix(int[] chart) {
    int length = chart.length;
    int[] a = new int[length];
    int[] l = new int[length];
    for (int i = 0; i < length; i++) {
      l[i] = i;
    }

    Arrays.fill(a, 1);
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < i; j++) {
        if (chart[i] > chart[j]) {
          if (a[j] >= a[i]) {
            l[i] = j;
            a[i] = a[j] + 1;
          }
        }
      }
    }
    return length - Arrays.stream(a).max().getAsInt();
  }
}
