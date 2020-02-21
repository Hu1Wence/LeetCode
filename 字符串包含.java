import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] strs = sc.nextLine().split(" ");
            if (strs[0].contains(strs[1]) || strs[1].contains(strs[0])) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
