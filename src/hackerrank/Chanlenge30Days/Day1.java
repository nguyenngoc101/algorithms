package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine()) + i;
        double x1 = Double.valueOf(scanner.nextLine()) + d;
        String x2 = s + String.valueOf(scanner.nextLine());
        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);

    }
}
