class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int prev = 0;
        for (int number = 0; number < nums.length; number++) {
            if (nums[number] != val) {
                nums[prev] = nums[number];
                prev++;
            }
        }
        return prev;
    }
}