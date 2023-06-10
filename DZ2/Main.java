import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = getFloatFromUser(scanner);
        System.out.println("Вы ввели число: " + number);
    }

    public static float getFloatFromUser(Scanner scanner) {
        System.out.print("Введите число: ");
        float result;
        while (true) {
            try {
                result = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Произошла ошибка при получении числа");
                scanner.nextLine();
            }
        }
        return result;
    }
}