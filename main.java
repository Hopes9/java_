import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Arrays;
public class first {

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

    public static int[] addInArray(int[] a, int b) {
        int[] r = new int[a.length + 1];
        r[a.length] = b;
        System.arraycopy(a, 0, r, 0, a.length);

        return r;
    }

    public static double sum_squares_massiv(int[] a) {
        int sum_array = Arrays.stream(a).sum();
        double r = Math.pow(sum_array, 2);
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
        System.out.print("Сумма квадратов массива arrd = ");
        System.out.println(sum_squares_massiv(arrd));
        System.out.print("Есть два массива: arrd = {");
        for (int i = 0; i < arrd.length; i++) {
            System.out.print(arrd[i]);
            if (i != arrd.length - 1) {System.out.print(", ");}
        }
        System.out.print("} arr = {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {System.out.print(", ");}
        }
        int[] c = concatArray(arr, arrd);
        System.out.print("}\nСоединение массивов: {");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i != c.length - 1) {System.out.print(", ");}
        }
        System.out.print("}\nРазницу между самым большим и самым маленьким числом в массиве - ");

        System.out.print(sum_int(arr));

        System.out.print("\nДобавлять значения в массив старый массив arr = {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {System.out.print(", ");}
        }
        System.out.print("} новый {");
        int[] b = addInArray(arr, 5);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i != b.length - 1) {System.out.print(", ");}
        }
        System.out.print("}\nСмена первого и последнего элемента arrd = {");
        int[] a = revers_int(arrd);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {System.out.print(", ");}
        }
        System.out.print("}");
    }
}
