package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int factor = 2;
            System.out.println("Число "+number+" состоит из :");
            while (number > 1) {
                if (number % factor == 0) {
                    System.out.print(factor + " ");
                    number /= factor;
                } else {
                    factor++;
                }
            }


        } else System.out.println("Ошибка");
    }

}