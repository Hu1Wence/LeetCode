import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] strs = sc.nextLine().split(" ");

            int k = Integer.parseInt(strs[0]);
            int n = Integer.parseInt(strs[1]);
            int[] nums = new int[n * n];
            int cur = 0;
            for (int i = 0; i < n; i++) {
                String[] strings = sc.nextLine().split(" ");
                for (String s : strings) {
                    nums[cur++] = Integer.parseInt(s);
                }
            }
            Arrays.sort(nums);
            System.out.println(nums[k - 1]);

        }

    }
}
