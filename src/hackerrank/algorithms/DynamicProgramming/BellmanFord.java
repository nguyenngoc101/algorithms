package hackerrank.algorithms.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BellmanFord {

    private static final int INF = 999;

    public static void main(String[] args) {
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
        System.out.println(Arrays.stream(bellmanFord(n, d)).boxed()
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
