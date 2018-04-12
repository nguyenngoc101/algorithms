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

    /*
    // Beautiful Solution
    // Idea:
    // O(n log(n)) solution.
    //1. find the LCM of all the integers of array A.
    //2. find the GCD of all the integers of array B.
    //3. Count the number of multiples of LCM that evenly divides the GCD.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
        System.out.println(count);
    }


    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }*/
}
