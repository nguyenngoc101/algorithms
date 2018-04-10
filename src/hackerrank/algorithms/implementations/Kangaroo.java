package hackerrank.algorithms.implementations;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        float n = (float) (x1-x2) / (v2-v1);
        if (n >= 0 && n == (int) n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
