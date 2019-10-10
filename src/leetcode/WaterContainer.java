package leetcode;

public class WaterContainer {

    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        for (int i =0; i< n; i++) {
            for (int j = i+ 1; j<n; j++) {
                max = Math.max((j-i) * Math.min(height[i], height[j]), max);
            }
        }
        return max;
    }
}
