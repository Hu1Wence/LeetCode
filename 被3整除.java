import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for (int i = l; i <= r; i++) {
                int a = 1;
                int sum = 0;
                while (a <= i) {
                    sum += a;
                    a++;
                }
                if (sum % 3 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
