package hackerrank.algorithms.implementations;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int apples = 0;
        int oranges = 0;
        for (int i = 0; i < m ; i++) {
            int x = scanner.nextInt();
            if (a + x >= s && a + x <= t) apples++;
        }
        System.out.println(apples);
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (b + x >= s && b + x <= t) oranges++;
        }
        System.out.println(oranges);
        scanner.close();
    }
}
