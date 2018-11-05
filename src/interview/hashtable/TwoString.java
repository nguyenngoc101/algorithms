package interview.hashtable;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pairs = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < pairs; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(existSubString(s1, s2));
        }
    }

    public static String existSubString(String str1, String str2) {
        Set<Character> characterSet1 = new HashSet<>();
        Set<Character> characterSet2 = new HashSet<>();
        for (char c: str1.toCharArray()) {
            characterSet1.add(c);
        }
        long size1 = characterSet1.size();
        for (char c: str2.toCharArray()) {
            characterSet2.add(c);
            characterSet1.add(c);
        }
        if (characterSet1.size() < size1 + characterSet2.size()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
