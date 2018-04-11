package hackerrank.algorithms.Strings;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars  = scanner.nextLine().toCharArray();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') count++;
        }
        System.out.println(count);
    }
}
