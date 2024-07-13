import java.util.Arrays;

public class Selection {
    /*
     * used for unorded array
     */
    public static int[] selection(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[minindex] > n[j]) {
                    minindex = j;
                }
            }
            int temp = n[i];
            n[i] = n[minindex];
            n[minindex] = temp;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 11, 22, 7, 56, 0 };
        System.out.println("Intiial array : " + Arrays.toString(array));
        System.out.println("Selection sort : " + Arrays.toString(selection(array)));
    }
}