package hackerrank.algorithms.implementations;

import java.util.Arrays;
import java.util.Scanner;

public class BirthDayChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.close();
        int count = 0;
        int sum;
        for (int i = 0; i <= numbers.length - m; i++) {
            sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += numbers[j];
            }
            if (sum == d) {
                count++;
            }
        }

        System.out.println(count);
    }

    // Beautiful solution
    public static int solve(int n, int[] s, int d, int m){
        int total=0;
        for (int i=0;i<=n-m;i++){
            if(Arrays.stream(s, i, i+m).sum() == d)
                total++;
        }
        return total;
    }

}
