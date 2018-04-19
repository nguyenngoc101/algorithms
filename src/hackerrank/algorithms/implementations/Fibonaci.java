package hackerrank.algorithms.implementations;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        System.out.println(fibonaci(n));
        System.out.println(recursiveFibonaci(n));
    }

    public static int fibonaci(int n) {
        if (n < 2) return n;
        int fa = 0;
        int fb = 1;
        for (int i = 2; i <= n; i++) {
            fb = fa + fb;
            fa = fb - fa;
        }
        return fb;
    }

    public static int recursiveFibonaci(int n) {
        if (n < 2) return n;
        return recursiveFibonaci(n - 1) + recursiveFibonaci(n - 2);
    }
}
