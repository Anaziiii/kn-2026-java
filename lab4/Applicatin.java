package lab4;

import java.util.Scanner;

public class Applicatin {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
            // Перевірка умови
            if (n % 2 != 0) {
                System.out.println("Weird");
            }
            else {
                if (n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                }
                else if (n >= 6 && n <= 20) {
                    System.out.println("Weird");
                }
                else if (n > 20) {
                    System.out.println("Not Weird");
                }
            }
        }
    }

   
    
}