package interview;


import java.util.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(matchSocks(n, a));

    }

    public static int matchSocks(int n, int[] a) {
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(a[i])) {
                colors.add(a[i]);
            } else {
                pairs++;
                colors.remove(a[i]);
            }
        }
        return pairs;
    }
}
