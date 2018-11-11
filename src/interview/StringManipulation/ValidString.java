package interview.StringManipulation;

import java.util.*;
import java.util.stream.Collectors;

public class ValidString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    Map<Character, Integer> frequences = new HashMap<>();
    for (char c : s.toCharArray()) {
      Integer fq = frequences.get(c);
      if (fq == null) {
        frequences.put(c, 1);
      } else {
        frequences.put(c, fq + 1);
      }
    }
    List<Integer> values = frequences
        .entrySet().
        stream().map(k -> k.getValue())
        .sorted().collect(Collectors.toList());
    int size = values.size();
    if (size == 1 || values.stream().distinct().count()==1) {
      System.out.println("YES");
      return;
    }

    if (isSame(values.get(0), values.subList(1, size)) || isSame(values.get(size -1), values.subList(0, size -1))) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
  private static boolean isSame(int value, List<Integer> list) {
    long dis = list.stream().distinct().count();
    if (dis == 1 && (value==1 || list.get(0) -value ==1 || list.get(0) -value == -1)) {
      return true;
    }
    return false;
  }
}
