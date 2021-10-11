import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Arrays;
public class Rectangle {
    public static int[] concatArray(int[] a, int[] b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        int[] r = new int[a.length + b.length];
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
        r[0] = a[a.length - 1 ];
        for (int i = 1; i < a.length; i++) {
            if (i != a.length - 1) {
                r[i] = a[i];
            }
        }
        r[a.length - 1] = a[0];
        return r;
    }
    public static void main(String[] args) {
        int[] arrd = {1, 53, 413, 331, 756};
        int[] arr = {1, 5, 4, 3, 7};

        int[] c = concatArray(arrd, arr);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            System.out.print(" ");
        }
        System.out.println("\nnext");
        
        System.out.print(sum_int(arr));
        
        System.out.println("\nnext");
        int[] b = add_array(arr, 6);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println("\nnext");
        int[] a = revers_int(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
