import java.util.HashSet;
import java.util.Set;

public class Test {
    public int numJewelsInStones(String J, String S) {
        Set<Character> chars = new HashSet<>();

        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            chars.add(c);
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (chars.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
