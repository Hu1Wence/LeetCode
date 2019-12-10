import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
    public int game(int[] guess, int[] answer) {
       int count = 0;
       for (int i = 0; i < guess.length; i++) {
           if (guess[i] == answer[i]) {
               count++;
           }
       }
       return count;
    }
}