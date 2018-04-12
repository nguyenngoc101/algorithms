package hackerrank.algorithms.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        List<Integer> result = new ArrayList<>();

        int max = Arrays.stream(b).max().getAsInt();
        for (int i = 1; i <= max; i++) {
            if (isFactor(i, a) && isFactored(i, b)) {
                result.add(i);
            }
        }
        System.out.println(result.size());
    }

    public static boolean isFactored(int n, int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] % n != 0) return false;
        }
        return true;
    }

    public static boolean isFactor(int n, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(n % a[i] != 0) return false;
        }

        return true;
    }
}
