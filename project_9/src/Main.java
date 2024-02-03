import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;

    try {
        System.out.println("Введите размер внешего массива");
        int outer = scanner.nextInt();

        System.out.println("Введите размер внутреннего массива");
        int inner = scanner.nextInt();

        double[][] matrix = new double[outer][inner];

        System.out.println("Введите данные.");
        for (int i = 0; i < outer; i++) {
            for (int n = 0; n < inner; n++) {
                double m = scanner.nextDouble();
                matrix[i][n] = m;
                count += m;
            }
        }

        double average = count / (outer * inner);

        for (int i = 0; i < inner; i++) {
            for (int n = 0; n < inner; n++) {
                matrix[i][n] *= average;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    } catch (InputMismatchException e) {
        System.out.println("Ошибка");
    }

        scanner.close();
    }
}