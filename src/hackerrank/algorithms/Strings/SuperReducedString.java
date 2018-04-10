package hackerrank.algorithms.Strings;

import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String origin = scanner.nextLine();
        System.out.println(reduce(origin));
        System.out.println(solve(origin));
    }

    public static String reduce(String origin) {
        boolean isReduced;
        if (origin.length() <= 1) return origin;
        do {
            isReduced = false;
            for (int i = 0; i < origin.length() - 1; i++) {
                if (origin.charAt(i) == origin.charAt(i+1)) {
                    if (origin.length() == 2) return "Empty String";
                    origin = origin.substring(0, i) + origin.substring(i+2);
                    isReduced = true;
                    break;
                }
            }
        } while (isReduced && origin.length()>1);

        return origin;
    }

    public static String solve(String input) {
        char []remains = new char[input.length()];
        int top = -1; // highest valid index

        for (char c: input.toCharArray())
            if (top < 0 || c != remains[top])
                remains[++top] = c;
            else
                --top;

        return top < 0 ? "Empty String"
                : new String(remains, 0, top+1);
    }
}
