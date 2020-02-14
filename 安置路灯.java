import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        while (sc.hasNext()) {
            int loadLength = sc.nextInt();
            String load = sc.next();
            int count = 0;
            for (int i = 0; i < loadLength; i++) {
                if (load.charAt(i) == '.') {
                    i += 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
