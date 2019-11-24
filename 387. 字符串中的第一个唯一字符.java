import java.util.HashMap;

public class Test {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = hashMap.getOrDefault(c, 0);
            hashMap.put(c, count + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
