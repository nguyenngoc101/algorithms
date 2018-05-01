package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if (isPrime(Integer.valueOf(scanner.nextLine()))) {

                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
