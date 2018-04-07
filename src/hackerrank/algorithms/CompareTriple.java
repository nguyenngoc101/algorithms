package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTriple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bob = scanner.nextLine();
        String alice = scanner.nextLine();

        int[] bobs = convertStringToIntArr(bob.split(" "));
        int[] alices = convertStringToIntArr(alice.split(" "));

        int bobPoints = 0;
        int alicePoints = 0;
        for (int i = 0; i < bobs.length; i++) {
            if (bobs[i] > alices[i]) bobPoints++;
            else if (bobs[i] < alices[i]) alicePoints++;
        }

        System.out.println(bobPoints + " " +alicePoints);

    }

    public static int[] convertStringToIntArr(String[] strs) {
        return Arrays.stream(strs).mapToInt(e -> Integer.parseInt(e)).toArray();
    }


}
