package interview.hashtable;

import java.util.*;

public class SherlockandAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(count(scanner.nextLine()));
        }
    }

    public static int countAnagrams(String s1, int length) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i <= s1.length() - length; i++) {
            String s = s1.substring(i, i + length);
            String sorted = s.chars()
                     .sorted()
                     .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                     .toString();
             Integer value = map.get(sorted);
             if (value == null) {
                 map.put(sorted, 1);
             } else {
                 map.put(sorted, ++value);
             }
        }
        count = map.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> (e.getValue() * (e.getValue() - 1)) /2)
                .reduce(0, (x, y) -> x + y);
        return count;
    }

    public static int count(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            count += countAnagrams(s, i);
        }
        return count;
    }
}
