import java.util.HashMap;
import java.util.List;

public class Test {
    public List<String> commonChars(String[] A) {
       char[] chars = A[0].toCharArray();
       HashMap<Character, Integer> hashMap = new HashMap<>();
       for (char c : chars) {
           hashMap.put(c, 0);
       }
       for (String str : A) {
           char[] temp = str.toCharArray();
           for (char ch : temp) {
               if (hashMap.containsKey(ch)) {
                   hashMap.put(ch, 1);
               }
           }
       }
    }
}