import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите размер внешего массива");
            int outer = scanner.nextInt();

            System.out.println("Введите размер внутреннего массива");
            int inner = scanner.nextInt();

            int[][] matrix = new int[outer][inner];

            System.out.println("Введите данные.");

            for (int i = 0; i < outer; i++) {
                for (int n = 0; n < inner; n++) {
                    matrix[i][n] = scanner.nextInt();
                }
            }

            for (int i = 0; i < inner; i++) {
                matrix[0][i] *= 3;
                System.out.println(matrix[0][i]);
            }

            System.out.println(Arrays.toString(matrix[0]));

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        }
        scanner.close();
    }
}