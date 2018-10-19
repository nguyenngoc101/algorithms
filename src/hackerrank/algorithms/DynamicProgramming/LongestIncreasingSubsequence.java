package hackerrank.algorithms.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        /**
         * F(1) = 1
         * F(i) = max{F(j) + 1}
         *  1 <= j < i and a[j] < a[i] </>
         */
        longestIncreasingSubsequence(n, a);
    }

    public static void longestIncreasingSubsequence(int n, int a[]) {
        int[] s = new int[n];
        int[] trace = new int[n];
        Arrays.fill(s, 1);
        for (int i = 0; i < n; i++) {
            boolean isChanged = false;
            for (int j = 0; j < i; j++) {
                if (a[i] >= a[j] && (s[i] < s[j] + 1)) {
                    s[i] = s[j] + 1;
                    trace[i] = j;
                    isChanged = true;
                }
            }
            if (!isChanged) trace[i] = -99;
        }

        int max = 0;
        int lastElement=0;
        for (int i = 0; i < n; i++) {
            if (s[i] > max) {
                max = s[i];
                lastElement = i;
            }
        }

        List<Integer> results = new ArrayList<>();
        while (trace[lastElement] >= 0 ) {
            results.add(a[lastElement]);
            lastElement = trace[lastElement];
        }
        results.add(a[lastElement]);
        for (int i = results.size() - 1; i >= 0; i--) {
            System.out.print(results.get(i) + " ");
        }
    }

    private static Result getLongestIncreasingSubsequence(int n, int[] a) {
        int[] s = new int[n];
        int endPosition = s[0];
        int maxLength = 1;
        Arrays.fill(s, 1);
        for (int i = 0; i < n-1; i++) {
            if(a[i+1] >= a[i]) {
                s[i + 1] = s[i] + 1;
                if (s[i+1] > maxLength) {
                    maxLength = s[i + 1];
                    endPosition = i + 1;
                }
            }
        }

        return new Result(n, a, endPosition, maxLength);
    }

    public static void printResult(Result result) {
        System.out.println("The end position: "+result.endPosition);
        for (int i = (result.endPosition - result.lengthOfSubsequence + 1); i <= result.endPosition; i++) {
            System.out.print(result.a[i] + " ");
        }
    }
    public static class Result {
        public int n;
        public int a[];
        public int endPosition;

        public int lengthOfSubsequence;
        public Result(int n, int[] a, int endPosition, int lengthOfSubsequence) {
            this.n = n;
            this.a = a;
            this.endPosition = endPosition;
            this.lengthOfSubsequence = lengthOfSubsequence;
        }

    }

    public static void test(int n, int a[]) {
        int[] s = new int[n];
        Arrays.fill(s, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] >= a[j] && (s[i] < s[j] + 1)) {
                    s[i] = s[j] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(s[i] + " ");
        }
    }

}
