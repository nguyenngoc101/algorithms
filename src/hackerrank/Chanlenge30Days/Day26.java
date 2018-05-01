package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actualDate = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();

        int exDate = scanner.nextInt();
        int exMonth = scanner.nextInt();
        int exYear = scanner.nextInt();

        int diffY = actualYear - exYear;
        int diffM = actualMonth - exMonth;
        int diffD = actualDate - exDate;

        if (diffY >= 1) System.out.println(10000);
        else if (diffY == 0 && diffM > 0) System.out.println(500 * diffM);
        else if (diffY == 0 && diffM == 0 && diffD > 0) System.out.println(15 * diffD);
        else System.out.println(0);
    }
}
