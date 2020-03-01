
public class Main {
    public int findKth(int[] a, int n, int K) {
        quickHelper(a, 0, n - 1, K);
        quickHelper(a, 0, n - 1, K);

        return a[n - K];
    }

    public static void quickHelper(int[] a, int left, int right, int K) {
        if (left >= right) {
            return;
        }

        int index = partition(a, left, right);
        quickHelper(a, left, index - 1, K);
        quickHelper(a, index + 1, right, K);
    }

    private static int partition(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int index = a[right];
        while (i < j) {

            while (i < j && a[i] <= index) {
                i++;
            }

            while (i < j && a[j] >= index) {
                j--;
            }
            swap(a, i, j);
        }
        swap(a, i, right);
        return i;
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
