package hackerrank.algorithms;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height; j++){
                if(i + j >= height - 1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
