import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StepTracker steptracker = new StepTracker();

        System.out.println("Вы находитесь в главном меню программы <Счётчик калорий>");
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("Укажите месяц");
                int month = scanner.nextInt();
                while (month < 0 || month > 11) {
                    System.out.println("Значение месяца должно быть неотрицательным и не превышать 11");
                    System.out.println("Укажите месяц");
                    month = scanner.nextInt();
                }

                System.out.println("Укажите день");
                int day = scanner.nextInt();
                while (day < 1 || day > 30) {
                    System.out.println("Значение дня должно быть неотрицательным и не превышать 30");
                    System.out.println("Укажите день");
                    day = scanner.nextInt();
                }

                System.out.println("Укажите количество шагов");
                int steps = scanner.nextInt();
                while (steps < 0) {
                    System.out.println("Количество шагов должно быть неотрицательным");
                    System.out.println("Укажите количество шагов");
                    steps = scanner.nextInt();
                }
                steptracker.addSteps(month, day, steps);

            } else if (userInput == 2) {
                System.out.println("Укажите месяц, за который вывести статистику");
                int month = scanner.nextInt();
                steptracker.printStatistics(month);

            } else if (userInput == 3) {
                System.out.println("Задайте дневную цель по шагам");
                int stepsGoal = scanner.nextInt();
                while (stepsGoal <= 0) {
                    System.out.println("Дневная цель должна быть больше 0");
                    System.out.println("Задайте дневную цель оп шагам");
                    stepsGoal = scanner.nextInt();
                }
                steptracker.modifyGoal(stepsGoal);
            } else {
                System.out.println("Извините, такой команды нет. Возврат в главное меню");
            }
            printMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Задать цель по количеству шагов в день");
        System.out.println("0 - Выйти из программы");
    }
}
