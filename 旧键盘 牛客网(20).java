import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String trueString = scanner.next();
            String falseString = scanner.next();
            trueString = trueString.toUpperCase();
            falseString = falseString.toUpperCase();
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < falseString.length(); i++) {
                set.add(falseString.charAt(i));
            }
            HashSet<Character> setPrint = new HashSet<>();
            for (int i = 0; i < trueString.length(); i++) {
                if (set.contains(trueString.charAt(i))) {
                    continue;
                }
                if (setPrint.contains(trueString.charAt(i))) {
                    continue;
                }
                System.out.print(trueString.charAt(i));
                setPrint.add(trueString.charAt(i));
            }

        }
    }
}
