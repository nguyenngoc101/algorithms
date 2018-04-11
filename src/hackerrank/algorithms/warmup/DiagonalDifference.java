package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int size = Integer.parseInt(scanner.nextLine());
//        String[][] matrix = new String[size][size];
//        int i = 0;
//        while (i < size) {
//            String[] rowEles = scanner.nextLine().split(" ");
//            for (int j = 0; j < size; j++) {
//                matrix[i][j] = rowEles[j];
//            }
//            i++;
//        }
//
//        scanner.close();
//
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int k = 0; k < size; k++) {
//            for (int j = 0; j < size; j++) {
//                if (k==j) sum1 += Integer.valueOf(matrix[k][j]);
//                if (k+j == size-1) sum2 += Integer.valueOf(matrix[k][j]);
//            }
//        }
//        System.out.println(Math.abs(sum1-sum2));

        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int sumDia1 = 0;
        int sumDia2 = 0;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                int num = in.nextInt();
                /* If i == j then element is on diagonal with left-top to right-bottom corner
                   else if i + j is one less than length of matrix then element is on another diagonal*/
                if (i == j){
                    sumDia1 += num;
                }
                if(i + j == len-1){
                    sumDia2 += num;
                }
            }// End of inner for loop
        }// End of outer for loop
        System.out.println(Math.abs(sumDia1 - sumDia2));
    }
}
