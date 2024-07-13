import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for(int range = 10; range <= 30; range += 10) {
        System.out.println("Ваша задача угадать число.");  
        System.out.println("Текущий уровень " + range / 10);    
        int number = (int) (Math.random() * range);
        playLevel(range, number);
        }
        scanner.close();
    }

    private static void playLevel(int range, int number) {
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Вы угадали число!");
                break;
            } else if (inputNumber > number) {
                System.out.println("Вы назвали число, которое больше.");
            } else if (inputNumber < number) {
                System.out.println("Вы назвали число, которое меньше.");
            }
        }
    }
}