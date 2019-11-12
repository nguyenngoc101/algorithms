package crackingcodinginterview.stringandarrays;

public class StringArray {

    public static void main(String[] args) {
//        System.out.println(isUnique("123456"));
//        System.out.println(isUnique("1234546"));
//        System.out.println(isUnique(""));

        System.out.println(isUniqueChars("123456"));
        System.out.println(isUniqueChars("1234546"));
        System.out.println(isUniqueChars(""));

//        System.out.println(isPermutation("123", "321"));
//        System.out.println(isPermutation("", ""));
//        System.out.println(isPermutation("1", "1"));
//        System.out.println(isPermutation("123", "322"));
//        System.out.println(isPermutation("123", "721"));
//        System.out.println(urlify("Mr Ngoc Nguyen Van"));
//        System.out.println(isOneEdit("pale", "ple"));
//        System.out.println(isOneEdit("pales", "pale"));
//        System.out.println(isOneEdit("pale", "bale"));
//        System.out.println(isOneEdit("pale", "bake"));
//        System.out.println(isOneEdit("paleew", "paeew"));
//        System.out.println(compress("aabcccccaaa"));
//        System.out.println(compress(""));
//        System.out.println(compress("abcdef"));

    }

    public static boolean isUnique(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPermutation(String str1, String str2) {
        int length = str1.length();
        if (length != str2.length()) {
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int i = 0;
        int j = length-1;
        while (i < length && j >=0) {
            if (chars1[i++] != chars2[j--]) {
                return false;
            }
        }
        return true;
    }

    public static String urlify(String url) {
        return url.replaceAll(" ", "%20");
    }

    public static boolean isOneEdit(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        if (Math.abs(chars1.length - chars2.length) > 1) {
            return false;
        }
        if (chars1.length == chars2.length) {
            int count = 0;
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) {
                    count++;
                    if (count > 1) return false;
                }
            }
        } else {
            return chars1.length > chars2.length ? isOne(chars1, chars2) :  isOne(chars2, chars1);
        }
        return true;
    }

    private static boolean isOne(char[] chars1, char[] chars2) {
        int i = 0;
        int j = 0;
        int diff = 0;
        while (i < chars1.length && j < chars2.length && diff < 2) {
            if (chars1[i] == chars2[j]) {
                i++;
                j++;
            } else {
                i++;
                diff++;
            }
        }

        return i == chars1.length || j == chars2.length;
    }

    public static String compress(String str) {
        String compressed = "";
        char[] chars = str.toCharArray();
        int i = 0;
        while (i < chars.length) {
            int count = 1;
            while (i < chars.length-1 && chars[i] == chars[i+1]) {
                i++;
                count++;
            }
            compressed = compressed+ chars[i] + count;
            i++;
        }
        return compressed;
    }

    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }


}
