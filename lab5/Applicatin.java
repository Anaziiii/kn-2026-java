package lab5;

import java.util.Locale;
import java.util.Scanner;

public class Applicatin {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.print("Введіть ціле число: ");

            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else {
                System.out.println("Помилка: Ви ввели не ціле число.");
                scanner.next();
            }

            
            System.out.print("Введіть дробове число (через крапку): ");

            if (scanner.hasNextDouble()) {
                double d = scanner.nextDouble();
                System.out.println("Double: " + d);
            } else {
                System.out.println("Помилка: Ви ввели не дробове число.");
                scanner.next();
            }


            scanner.nextLine();

            System.out.print("Введіть рядок: ");
            if (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                System.out.println("String: " + s);
            }
        }
    }
}
