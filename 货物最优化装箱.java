import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(",");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < strs.length; i++) {
                list.add(Integer.parseInt(strs[i]));
            }
            if (list.size() == 0) {
                continue;
            }
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 3 == 0) {
                    result.add(list.get(i));
                    list.remove(i);
                    i--;
                }
            }
            System.out.println(result.toString());
            Collections.sort(list);
            System.out.println(list.toString());
            for (int i = list.size() - 1; i >= 0; i--) {
                if (i == 0) {
                    break;
                }
                for (int j = i - 1; j >= 0; j--) {
                    if ((list.get(i) + list.get(j)) % 3 == 0) {
                        result.add(list.get(i));
                        list.remove(i);
                        result.add(list.get(j));
                        list.remove(j);
                        i--;
                    }
                }
            }
            System.out.println(result.toString());
            int count = 0;
            for (int i = 0; i < result.size(); i++) {
                count = count + result.get(i);
            }
            System.out.println(count / 3);
        }

    }
}