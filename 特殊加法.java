import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public int addAB(int A, int B) {
        int a;
        int b;
        while (B != 0) {
            a = A ^ B;
            b = (A&B) << 1;
            A = a;
            B = b;
        }
        return A;
    }
}