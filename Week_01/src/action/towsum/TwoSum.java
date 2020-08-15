package action.towsum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 0815
 * @author zhaohongxin
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++) {
            int sub = target - nums[i];
            if (hash.containsKey(sub)) {
                return new int[] {i, hash.get(sub)};
            }
            hash.put(nums[i], i);
        }
        throw new RuntimeException("no result");
    }
}
