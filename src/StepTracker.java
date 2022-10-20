public class StepTracker {

    int stepsGoal = 10000;

    Converter converter = new Converter();

    MonthData[] monthArray;

    public StepTracker() {
        monthArray = new MonthData[12];
        for (int i = 0; i < monthArray.length; i++) {
            monthArray[i] = new MonthData();
        }
    }

    class MonthData {
        int[] dailySteps = new int[30];
    }

    public void addSteps(int month, int day, int steps) {
        int currentSteps = monthArray[month].dailySteps[day - 1];
        monthArray[month].dailySteps[day - 1] = currentSteps + steps;
    }

    public void printStatistics(int month) {
        int[] dailySteps = monthArray[month].dailySteps;

        System.out.println("Статистика за " + month + " месяц");

        System.out.println("Количество пройденных шагов по дням:");
        for (int i = 0; i < dailySteps.length; i++) {
            System.out.print((i + 1) + " день: " + dailySteps[i] + ", ");
        }
        System.out.println("");

        int totalSteps = 0;
        for (int i = 0; i < dailySteps.length; i++) {
            totalSteps = totalSteps + dailySteps[i];
        }
        System.out.println("Общее количество шагов за месяц: " + totalSteps);

        int maxSteps = 0;
        for (int i = 0; i < dailySteps.length; i++) {
            if (dailySteps[i] > maxSteps) {
                maxSteps = dailySteps[i];
            }
        }
        System.out.println("Максимальное пройденное количество шагов в месяце: " + maxSteps);
        System.out.println("Среднее количество шагов за месяц: " + totalSteps / 30);
        System.out.println("Пройденная дистанция в километрах: " + converter.countDistance(totalSteps));
        System.out.println("Количество сожжённых килокалорий: " + converter.countCalories(totalSteps));

        int daysInARow = 0;
        int maxDaysInARow = 0;
        for (int i = 0; i < dailySteps.length; i++) {
            if (dailySteps[i] >= stepsGoal) {
                daysInARow = daysInARow + 1;
                if (daysInARow > maxDaysInARow) {
                    maxDaysInARow = daysInARow;
                }
            } else {
                daysInARow = 0;
            }
        }
        System.out.println("Лучшая серия из подряд идущих дней с превышением цели по шагам: " + maxDaysInARow);
    }

    public void modifyGoal(int goal) {
        stepsGoal = goal;
    }

    public int countTotalSteps () {

    }
    
}