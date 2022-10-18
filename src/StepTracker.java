public class StepTracker {

    int stepsGoal = 10000;

    // методы класса
    /*MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        // Заполните класс самостоятельно
    }*/
    int[] monthArray = new int[12];
    int[] daysInMonth = new int[30];

    public void addSteps(int month, int day, int stepsGoal) {

    }

    public void printStatistics(int month) {
        System.out.println("Статистика за " + month + "месяц:")

        System.out.print((i + 1) + " день: " + steps + ", ");

        System.out.println("Общее количество шагов: " + sum);

        System.out.println("Среднее количество шагов: " + mediana);

        System.out.println("Пройденная дистанция (в км): " + new Converter().distance(steps));

        System.out.println("Количество сожжённых килокалорий: " + new Converter().countCaliries(steps));

        //"Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого: "
        System.out.println("Лучшая серия: " + bestSeries(month));
    }

    public void modifyGoal(int goal) {
        stepsGoal = goal;
    }

    public void bestSeries(int month) {

    }
}