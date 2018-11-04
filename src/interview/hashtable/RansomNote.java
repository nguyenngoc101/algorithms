package interview.hashtable;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        String magazine = scanner.nextLine();
        String note = scanner.nextLine();
        Map<String, Long> magazines = Arrays.stream(magazine.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        boolean canCopy = true;
        for (String word : note.split(" ")) {
            Long appears = magazines.get(word);
            if (appears == null || appears <= 0) {
                canCopy = false;
                break;
            }
            magazines.put(word, appears - 1);
        }
        System.out.println(canCopy==true ? "Yes" : "No");
    }
}
