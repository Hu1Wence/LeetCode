import java.util.HashMap;


public class Test {
    public int findElement(int[] A, int n, int x) {
         int left = 0;
         int right = A.length - 1;
         int mid = (left + right) / 2;

         while (left <= right) {
             mid = (left + right) / 2;
             if (A[mid] == x) {
                 return mid;
             }

             if (A[mid] < x) {
                 if (A[mid] < A[left] && x > A[right]) {
                    right = mid - 1;
                 } else {
                     left = mid + 1;
                 }
             } else {
                 if (A[mid] > A[left] && x < A[left]) {
                     left = mid + 1;
                 } else {
                     right = mid - 1;
                 }
             }
         }
         return -1;
    }
}
