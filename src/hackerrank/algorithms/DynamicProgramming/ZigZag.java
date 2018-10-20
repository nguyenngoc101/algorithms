package hackerrank.algorithms.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
                System.out.print(a[i][j] + " ");
            }
        }
        scanner.close();

        System.out.println(zigzag(n, m, a));
    }

    private static int zigzag(int n, int m, int[][] a) {
        int s[][] = new int[n][m];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s[i][j] = 0;
                int up = j > 0 ? s[i][j - 1] + a[i][j] : a[i][j];
                int left = i > 0 ? s[i - 1][j] + a[i][j] : a[i][j];
                s[i][j] = up > left ? up : left;
                if (max < s[i][j]) max = s[i][j];
            }
        }


        return max;
    }
}
