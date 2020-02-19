import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] strs = sc.nextLine().split(" ");

            int i = Integer.parseInt(strs[0], 2);
            int j = Integer.parseInt(strs[1], 2);

            int temp = i + j;

            String result = Integer.toBinaryString(temp);
            System.out.println(result);
        }

    }
}
