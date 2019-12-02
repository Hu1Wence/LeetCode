import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        while (count < n) {
            nums1[m] = nums2[count];
            m++;
            count++;
        }
        Arrays.sort(nums1);
    }

}