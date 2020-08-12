package action.movezeroes;

/**
 * @author zhaohongxin
 */
public class MoveZeroes {
    public void solution(int[] nums) {
        int nonZeroPos = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                if (nonZeroPos != i) {
                    nums[nonZeroPos] = nums[i];
                    nums[i] = 0;
                }
                nonZeroPos ++;
            }

        }
    }
}
