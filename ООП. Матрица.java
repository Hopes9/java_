import java.util.Arrays;

public class Rectangle {
    public static void main(String[] args) {
        double[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        double[][] mat1 = {{5,5,5}, {5,5,5}, {5,5,5}};

        Matrix matrix1 = new Matrix(3, 3);
        matrix1.matrix = mat;

        Matrix matrix2 = new Matrix(3, 3);
        matrix2.matrix = mat1;

        matrix1.sum(matrix2).showMatrix();
        matrix1.multiply(5).showMatrix();

    }
}

class Matrix {
    public double[][] matrix;
    protected int m, n;

    Matrix (int m, int n) {
        this.matrix = new double[m][n];
        this.m = m;
        this.n = n;
    }

    public Matrix sum(Matrix secondMatrix) {
        if (!isSizeSame(secondMatrix)) throw new ArithmeticException("Складывать можно только матрицы одинакового размера.");

        Matrix output = new Matrix(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                output.matrix[i][j] = matrix[i][j] + secondMatrix.matrix[i][j];
            }
        }

        return output;
    }

    public Matrix multiply(int number) {
        Matrix output = new Matrix(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                output.matrix[i][j] = matrix[i][j] * number;
            }
        }

        return output;
    }

    public void showMatrix() {
        for (int i = 0; i < this.m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();
    }

    protected boolean isSizeSame(Matrix secondMatrix) {
        return m == secondMatrix.m && n == secondMatrix.n;
    }
}
