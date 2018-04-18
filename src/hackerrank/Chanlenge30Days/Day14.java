package hackerrank.Chanlenge30Days;

import java.util.Arrays;
import java.util.Scanner;

public class Day14 {

    static class Difference {
        private int[] elements;
        public int maximumDifference;

        public Difference (int[] elements) {
            this.elements = elements;
        }

        public void computeDifference() {
            this.maximumDifference = Arrays.stream(this.elements).max().getAsInt()
                    - Arrays.stream(this.elements).min().getAsInt();
        }

    }

    static public class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
}
