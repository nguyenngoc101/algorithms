package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(solveMeFirst(x, y));
    }

    public static int solveMeFirst(int x, int y) {
        return x + y;
    }
}
