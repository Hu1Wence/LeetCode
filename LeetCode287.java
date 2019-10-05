class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        for (int a : nums) {
            if (a < 1 || a > nums.length - 1) {
                return -1;
            }
        }
        int low = 1;
        int high = nums.length - 1;
        int mid;
        int count;
        while (low <= high) {
            mid = ((high - low) / 2) + low;
            count = countArr(nums, low, mid);
            if (low == high) {
                if (count > 1) {
                    return low;
                } else {
                    break;
                }
            }
            if (count > mid - low + 1) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public int countArr(int[] nums, int low, int high) {
        if (nums == null) {
            return 0;
        }
        int count = 0;
        for (int a : nums) {
            if (a >= low && a <= high) {
                count++;
            }
        }
        return count;
    }
}
