package hackerrank.algorithms.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dijkstra {

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
        System.out.println(Arrays.stream(dijkstra(n, d))
                .boxed()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(" ")));
    }

    // Shortest paths
    public static int[] dijkstra(int n, int[][] d) {
        int s[] = new int[n];
        List<Integer> v = IntStream.range(0, n).boxed().collect(Collectors.toList());
        for (int i = 1; i < n; i++) {
            s[i] = d[0][i];
        }
        while (!v.isEmpty()) {
            int candidate = candidate(s, v);
            // traverse neighbors of the candidate
            for (int i = 0; i < n; i++) {
                if (d[candidate][i] != INF && s[i] > s[candidate] + d[candidate][i]) {
                    s[i] = s[candidate] + d[candidate][i];
                }
            }
            v.remove(v.indexOf(candidate));
        }
        return s;
    }

    public static int candidate(int[] s, List<Integer> v) {
        int min = INF;
        int position = 0;
        for (int i = 0; i < s.length; i++) {
            if (v.contains(i) && min > s[i]) {
                min = s[i];
                position = i;
            }
        }
        return position;
    }
}
