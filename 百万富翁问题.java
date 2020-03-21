public class Main {
    public static void main(String[] args) {
        int day = 30;
        int rich = 0;
        int pool = 0;
        int temp = 1;
        for (int i = 0; i < day; i++) {
            rich += 10;
        }
        for (int i = 0; i < day; i++) {
            pool += temp;
            temp = temp * 2;
        }
        System.out.println(rich + " " + pool);
    }
}