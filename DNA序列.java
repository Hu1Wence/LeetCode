import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            HashMap<Integer, ArrayList<StringBuilder>> hashMap = new HashMap<>();
            for (int i = 0 ; i <= str.length() - num; i++) {
                int count = 0;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < num; j++) {
                    if (str.charAt(i + j) =='C' || str.charAt(i + j) == 'G') {
                        count++;
                    }
                    sb.append(str.charAt(i + j));
                }
                if (hashMap.containsKey(count)) {
                    hashMap.get(count).add(sb);
                } else {
                    ArrayList<StringBuilder> list = new ArrayList<>();
                    list.add(sb);
                    hashMap.put(count, list);
                }
            }
            int result = 0;
            for (Map.Entry<Integer, ArrayList<StringBuilder>> entry : hashMap.entrySet()) {
                if (entry.getKey() >= result) {
                    result = entry.getKey();
                }
            }
            System.out.println(hashMap.get(result).get(0).toString());
        }
    }
}