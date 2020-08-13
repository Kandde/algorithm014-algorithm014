package action.maxarea;

/**
 * 1. 0813
 * @author zhaohongxin
 */
public class MaxArea {

    public int solution1(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i ++) {
            for (int j = i + 1; j < height.length; j ++) {
                int currentArea = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(currentArea, maxArea);
            }
        }
        return maxArea;
    }

    public int solution2(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; j != i;) {
            int effectHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxArea = Math.max(maxArea,effectHeight * (j - i + 1));
        }
        return maxArea;
    }

}
