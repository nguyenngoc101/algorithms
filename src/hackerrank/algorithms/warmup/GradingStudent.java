package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class GradingStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();
            if (grade >= 38 && grade % 5 >= 3) {
                System.out.println(Math.round(grade/5.0) * 5);
            } else {
                System.out.println(grade);
            }
        }
    }
}
