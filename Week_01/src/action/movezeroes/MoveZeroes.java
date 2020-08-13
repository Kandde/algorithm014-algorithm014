package action.movezeroes;

/**
 * 1. 0812
 * 2. 0813 分清前后指针
 * @author zhaohongxin
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
