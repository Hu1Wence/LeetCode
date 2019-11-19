import java.util.HashMap;
import java.util.Map;

public class Test {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
           int count = map.getOrDefault(x, 0);
           map.put(x, count + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue().equals(1)) {
                return m.getKey();
            }
        }
        return 0;
    }
}
