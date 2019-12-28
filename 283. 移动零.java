public class Test {
    public void moveZeroes(int[] nums) {
        int i = 0;//找0
        int j = 0;//找非0
        while (true) {
            while (i < nums.length && nums[i] != 0) {
                //找到值为 0 的下标
                i++;
            }
            while (j < nums.length && nums[j] == 0) {
                //找到值为 非0 的下标
                j++;
            }
            if (j >= nums.length || i >= nums.length) {
                //如果任意一个超出数组大小则代表排序完毕
                break;
            }
            if (j < i) {
                //如果 非0 的下标小于 为0 的下标,则不需要交换并且 非0要 +1
                j++;
                continue;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}