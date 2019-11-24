import java.util.HashMap;

public class Test {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int x : nums) {
            int count = hashMap.getOrDefault(x, 0);
            hashMap.put(x, count + 1);

            if (hashMap.get(x) == 2) {
                return true;
            }
        }
        return false;
    }
}
