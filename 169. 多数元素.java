import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int x : nums) {
            int count = hashMap.getOrDefault(x, 0);
            hashMap.put(x, count + 1);
        }
        Iterator iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            int key = (int)entry.getKey();
            int val = (int)entry.getValue();
            if (val > (nums.length / 2)) {
                return key;
            }
        }
        return -1;
    }
}