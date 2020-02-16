import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] s = sc.nextLine().split(" ");
            String[] nums = sc.nextLine().split(" ");

            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for (int i = 0; i <= Integer.parseInt(s[0]); i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 0; i < Integer.parseInt(s[1]); i++) {
                list.get(Integer.parseInt(nums[i])).add(Integer.parseInt(nums[i]));
            }

            int min = list.get(1).size();

            for (int i = 1; i <= Integer.parseInt(s[0]); i++) {
                if (min >= list.get(i).size()) {
                    min = list.get(i).size();
                }
            }

            System.out.println(min);
        }

    }
}
