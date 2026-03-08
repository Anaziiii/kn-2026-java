package lab2;

public class Applicatin {

    public static void main(String[] args) {

        Poverkh:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2) {
                    System.out.println("Пропускаємо весь 2-й поверх");
                    continue Poverkh;
                }
                if (i == 9) {
                    System.out.println("Зупиняємо цикл після 9");
                    break Poverkh;
                }
                System.out.println("Поверх " + i + ", Кімната " + j);
            }
        }

    }
}