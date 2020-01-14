import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        if (str.toString().equals(str.reverse().toString())) {
            return true;
        }
        return false;
    }
}

