/*

Домашнее задание:

Создать класс "Матрица".

Конструктор: на вход высота, ширина. Заполнение рандомом

Класс должен иметь следующие поля:

двумерный массив вещественных чисел;
количество строк и столбцов в матрице

Класс должен иметь следующие методы:

сложение с другой матрицей;
умножение на число;
вывод на печать;
статический метод умножения матрицы на матрицу. Возвращается третья матрица
Сделать подкласс Прямоугольная матрица

в конструктор передаётся размер. Заполнение рандомом

метод - определитель


 */















import java.util.Random;
import java.util.Arrays;

public class first {

    public static void main(String[] args) {
        Matrix m = new Matrix(3, 3);
        m.return_int();
        System.out.print("\n ");
        Matrix b = new Matrix(3, 3);
        b.return_int();
        System.out.print("\n ");
        b.sum_matrix(m);
        b.return_int();
    }
}
class Matrix {
    int[][] value;
    int n;
    int m;
    Matrix(int n, int m){
        this.value = new int[n][m];
        this.n = n;
        this.m = m;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                value[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
    }

    void return_int(){
        for (int i = 0; i < n; ++i) {
            System.out.print("\n ");
            for (int j = 0; j < m; ++j) {
                System.out.print(" " + this.value[i][j]);
            }
        }
//        System.out.println(Arrays.toString(this.value));
    }
    void sum_matrix(Matrix b){

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                this.value[i][j] += b.value[i][j];
            }
        }
    }
    void umnojenie (Matrix b){
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                this.value[i][j] += b.value[i][j];
            }
        }
    }

}























