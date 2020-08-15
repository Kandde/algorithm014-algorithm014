package action.threesum;

import java.util.*;

/**
 * 1. 0815
 *
 * @author zhaohongxin
 */
class Solution {
    /*public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(m);
        for (int i = 0; i < nums.length - 2; i ++) {
            for (int j = i + 1; j < nums.length - 1; j ++) {
                for (int k = j + 1; k < nums.length; k ++) {
                    if (nums[i] + nums[j] == -nums[k]) {
                        Integer[] m = {nums[i], nums[j], nums[k]};
                        result.add(Arrays.asList(m));
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }*/

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i ++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int k = i + 1, j = nums.length - 1;
            while (k < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    while(k < j && nums[k] == nums[++k]);
                } else if (sum > 0) {
                    while(k < j && nums[j] == nums[--j]);
                } else {
                    Integer[] m = {nums[i], nums[j], nums[k]};
                    result.add(Arrays.asList(m));
                    while(k < j && nums[j] == nums[--j]);
                    while(k < j && nums[k] == nums[++k]);
                }
            }
        }
        return new ArrayList<>(result);
    }
}
