package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            printEvenOdd(scanner.nextLine());
        }
    }

    public static void printEvenOdd(String line) {
        String even = "";
        String odd = "";
        for (int i = 0; i < line.length(); i++) {
            if (i % 2 == 0) even += line.charAt(i);
            else odd += line.charAt(i);
        }
        System.out.println(even + " " + odd);
    }
}
