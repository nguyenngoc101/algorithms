package hackerrank.algorithms.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BellmanFord {

    private static final int INF = 999;

    public static void main(String[] args) {
        /**
         * Data:
         * 9
         * 0 4 999 999 999 999 999 8 999
         * 4 999 8 999 999 999 999 11 999
         * 999 8 999 7 999 4 999 999 2
         * 999 999 7 999 9 14 999 999 999
         * 999 999 999 9 999 1999 999 999 999
         * 999 999 4 14 1999 999 2 999 999
         * 999 999 999 999 999 2 999 1 6
         * 8 11 999 999 999 999 1 999 7
         * 999 999 2 999 999 999 6 7 999
         *
         * Result:
         * 0 4 12 19 28 11 9 8 14
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int d[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println(Arrays.stream(bellmanFord(n, d))
                .boxed()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(" ")));
    }

    // Shortest paths
    public static int[] bellmanFord(int n, int[][] d) {
        int s[] = new int[n];
        for (int i = 1; i < n; i++) {
            s[i] = d[0][i];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ( i != j && d[i][j] != INF && s[i] > s[j] + d[j][i]) {
                        s[i] = s[j] + d[j][i];
                    }
                }
            }
        }
        return s;
    }
}
