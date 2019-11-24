import java.util.HashMap;

public class Test {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = sMap.getOrDefault(c, 0);
            sMap.put(c, count + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int count = tMap.getOrDefault(c, 0);
            tMap.put(c, count + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (sMap.get(c) != tMap.get(c)) {
                return c;
            }
        }
        return '0';
    }
}
