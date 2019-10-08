package leetcode;

public class ZigZagConversion {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",4));
    }


    public static String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int length = s.length();
        int i = 0;
        while (i < length) {
            // di doc xuong
            for (int j = 0; j < numRows && i < length; j++) {
                sb[j].append(s.charAt(i++));
            }
            // di cheo len
            for (int j = numRows - 2; j > 0 && i < length; j--) {
                sb[j].append(s.charAt(i++));
            }
        }
        for (int j = 1; j < numRows; j++) {
            sb[0] = sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }

}
