import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int result = 0;
        System.out.println("Введите целое положительное число");
        if(scanner.hasNextInt()){
        int num = scanner.nextInt();
        if(num > 0) {
            for (int i = 0; i < num; i++) {
                if (i % 2 > 0) {
                    result += i;
                }
            }
            System.out.println("Сумма нечётных чисел до введённого числа - " + result);
        } else {
            System.out.println("Введено неверное число");
        }
        } else {
            System.out.println("Введите число");
        }

        scanner.close();
    }
}