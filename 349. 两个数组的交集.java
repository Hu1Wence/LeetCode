import java.util.HashSet;

public class Test {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i : nums1) {
            hashSet1.add(i);
        }
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int j : nums2) {
            if (hashSet1.contains(j)) {
                hashSet2.add(j);
            }
        }
        int[] result = new int[hashSet2.size()];
        int count = 0;
        for (Integer integer : hashSet2) {
            result[count] = integer;
            count++;
        }
        return result;
    }

}