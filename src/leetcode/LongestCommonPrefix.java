package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String shortest = getShortest(strs);
        if (shortest.length() == 0) return "";
        for (int i = shortest.length(); i > 0; i--) {
            String candidate = shortest.substring(0, i);
            boolean isPrefix = true;
            for (int j=0; j<strs.length; j++) {
                if (!strs[j].startsWith(candidate)) {
                    isPrefix = false;
                    break;
                }
            }
            if (isPrefix) {
                return candidate;
            }
        }
        return "";
    }

    private String getShortest(String[] strs) {
        if (strs.length == 0) return "";
        String shortest = strs[0];
        for (int i = 1; i<strs.length; i++) {
            if (strs[i].length() < shortest.length()) {
                shortest = strs[i];
            }
        }
        return shortest;
    }
}
