import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int li = j + 1;
                int ri = nums.length - 1;
                while (li < ri) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[li];
                    sum += nums[ri];

                    if (target > sum) {
                        li++;
                    } else if (target < sum) {
                        ri--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[li], nums[ri]));
                        while (li < ri && nums[li] == nums[li + 1]) li++;
                        while (li < ri && nums[ri] == nums[ri - 1]) ri--;
                        li++;
                        ri--;
                    }
                }
            }
        }
        return res;
    }
}
