import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int alarm_count = Integer.parseInt(sc.nextLine());
            int[] alarm_Time = new int[alarm_count];
            for (int i = 0 ; i < alarm_count; i++) {
                String[] s = sc.nextLine().split(" ");
                alarm_Time[i] = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
            }

            Arrays.sort(alarm_Time);

            int toClass = Integer.parseInt(sc.nextLine());
            String[] str = sc.nextLine().split(" ");
            int classTime = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);

            int maxLate = classTime - toClass;
            int i = alarm_count - 1;
            while (maxLate < alarm_Time[i]) {
                i--;
            }
            int minute = alarm_Time[i] % 60;
            int hour = alarm_Time[i] / 60;

            System.out.println(hour + " " + minute );
        }

    }
}
