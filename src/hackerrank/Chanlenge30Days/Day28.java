package hackerrank.Chanlenge30Days;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {

        String REGEX = "(\\w+)\\s(.*)@gmail\\.com";

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List result = new ArrayList();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (s.contains("@gmail.com"))
            result.add(s.replaceAll(REGEX, "$1").trim());
        }
        result.stream().sorted().forEach(System.out::println);
    }
}
