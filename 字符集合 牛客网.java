import java.util.HashMap;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            changeString(str);
            System.out.println();
        }
    }

    public static void changeString(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = hashMap.getOrDefault(c, 0);
            hashMap.put(c, count += 1);
            if (hashMap.get(c) == 1) {
                System.out.print(c);
            }
        }
    }
}
