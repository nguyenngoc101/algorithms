package leetcode;

public class IntegerReverse {

    public static void main(String[] args) {
        System.out.println(reverse(9646324351l));

    }
    public static long reverse(long x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = x * -1;
        }

        String input = String.valueOf(x);
        char[] chars = input.toCharArray();
        String reversedX = "";
        for(int i = chars.length-1; i >= 0 ; i--) {
            reversedX =  reversedX + chars[i];
        }
        return isNegative ? Long.valueOf(reversedX) * -1 : Long.valueOf(reversedX);
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
