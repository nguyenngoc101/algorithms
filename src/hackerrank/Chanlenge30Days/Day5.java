package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", n, i, n*i));
        }
    }

}
