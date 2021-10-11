import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Arrays;
public class first {
    public static double[] concatArray(double[] a, double[] b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        double[] r = new double[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }
    public static int sum_int(int[] a) {
        OptionalInt min = Arrays.stream(a).min();
        OptionalInt max = Arrays.stream(a).max();
        int raz = max.getAsInt() - min.getAsInt();
        return raz;
    }

    public static int[] add_array(int[] a, int b) {
        int[] r = new int[a.length + 1];
        System.arraycopy(a, 0, r, 0, a.length);
        return r;
    }

    public static int[] revers_int(int[] a) {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i != 0 || i != a.length) {
                System.out.print(i);
                r[i] = a[i];
            }
        r[0] = a[a.length];
        r[a.length] = a[a.length];
        }
        return r;
    }
    public static void main(String[] args) {
//        double[] first_1 = {345.45, 345.45,345.45};
//        double[] first_2 = {345.45345, 3453455.45,34457565.45};
//        System.out.print(concatArray(first_1, first_2));


        int[] arr = {1, 5, 4, 3, 7};
//      System.out.print(sum_int(arr))
//      System.out.print(add_array(arr, 6));
        revers_int(arr);

    }
}



