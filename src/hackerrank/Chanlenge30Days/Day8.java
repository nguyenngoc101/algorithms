package hackerrank.Chanlenge30Days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        Map<String, String> phonebook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] lines = scanner.nextLine().split(" ");
            phonebook.put(lines[0], lines[1]);
        }
        for (int i = 0; i < n; i++) {
            String key = scanner.nextLine();
            String value = phonebook.get(key);
            if (value == null) {
                System.out.println("Not found");
            } else {
                System.out.println(key + "=" +value);
            }
        }
        scanner.close();
    }
}
