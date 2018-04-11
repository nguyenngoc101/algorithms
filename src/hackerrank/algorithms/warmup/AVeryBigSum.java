package hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        long[] eles = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(e -> Long.parseLong(e)).toArray();
        long sum = Arrays.stream(eles).sum();
        System.out.println(sum);
        scanner.close();
    }
}
