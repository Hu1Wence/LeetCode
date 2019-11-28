import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int x : arr) {
            int count = hashMap.getOrDefault(x, 0);
            hashMap.put(x, count + 1);
        }
        HashSet<Integer> hashSet = new HashSet<>(hashMap.values());
        if (hashMap.size() == hashSet.size()) {
            return true;
        }
        return false;
    }


}