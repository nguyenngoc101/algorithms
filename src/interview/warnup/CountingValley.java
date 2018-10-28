package interview.warnup;


import java.util.Scanner;

public class CountingValley {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        char[] a = scanner.next().toCharArray();

        System.out.println(countValleys(n, a));
    }

    public static int countValleys(int n, char[] a) {
        int valley = 0;
        int curAltitude = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == 'U') {
                curAltitude++;
                if (curAltitude == 0) {
                    valley++;
                }
            }
            if (a[i] == 'D') {
                curAltitude--;
            }
        }
        return valley;
    }
}
