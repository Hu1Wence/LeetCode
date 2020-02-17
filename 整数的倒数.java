import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            if (str.charAt(0) == '-') {
                System.out.print("-");
                StringBuffer sb = new StringBuffer(str);
                sb.deleteCharAt(0);
                System.out.print(sb.reverse().toString());
            } else {
                StringBuffer sb = new StringBuffer(str);
                System.out.print(sb.reverse().toString());
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
