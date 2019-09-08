package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class LongestSubstring {

    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring2("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            String sub = "" + chars[i];
            for (int j = i+1; j < chars.length; j++) {
                if (sub.indexOf(chars[j]) < 0) {
                    sub += chars[j];
                } else {
                    break;
                }
            }
            result[i] = sub.length();
        }
        return Arrays.stream(result).max().getAsInt();
    }

    public static int lengthOfLongestSubstring2(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

}
