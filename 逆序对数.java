import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int bottle = sc.nextInt();
            if (bottle == 0) {
                return;
            }
            System.out.println(drinkCount(bottle));
        }
    }

    private static int drinkCount(int bottle) {
        if (bottle < 2) {
            return 0;
        } else if (bottle == 2) {
            return 1;
        }
        return bottle / 3  + drinkCount(bottle / 3 + bottle % 3);
    }
}
