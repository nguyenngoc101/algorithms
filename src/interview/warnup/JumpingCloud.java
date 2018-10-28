package interview.warnup;

import java.util.Scanner;

public class JumpingCloud {

    private static int INF = Integer.MAX_VALUE;
    private static int MAX = 999;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] a = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            s[i] = (a[i] == 0) ? MAX : INF;
        }
        s[0] = 0;
        int t1, t2;
        for (int i = 1; i < n; i++) {
            if (a[i] == 1) continue;
            t1 = t2 = INF;
            if (s[i-1] != INF ) t1 = s[i - 1] + 1;
            if ((i-2 >= 0) && s[i-2] != INF ) t2 = s[i - 2] + 1;
            s[i] = t1 > t2 ? t2 : t1;
        }
        System.out.println(s[n-1]);
    }
}
