import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int testNum = sc.nextInt();
            String direction = sc.next();
            int start = 0;
            String[] temp = {"N", "E", "S", "W"};
            for (int i = 0; i < testNum; i++) {
                if (direction.charAt(i) == 'R') {
                    start = (start + 1) % 4;
                } else {
                    start = (start + 3) % 4;
                }
            }
            System.out.println(temp[start]);
        }
    }
}
