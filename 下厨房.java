import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] strings = str.split(" ");
            for (String s : strings) {
                set.add(s);
            }
        }
        System.out.println(set.size());
    }

}