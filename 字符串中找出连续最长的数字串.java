import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            List<String> list = new ArrayList<>();
            int i = 0;
            while (i < str.length()) {
                StringBuilder sb = new StringBuilder();
                while (i < str.length() && str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                    sb.append(str.charAt(i));
                    i++;
                }
                i++;
                list.add(sb.toString());
            }
            String s = list.get(0);
            for (int j = 1; j < list.size(); j++) {
                if (s.length() < list.get(j).length()) {
                    s = list.get(j);
                }
            }
            System.out.println(s);
        }
    }
}
