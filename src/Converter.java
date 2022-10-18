public class Converter {

    // методы класса
    /*Для подсчёта дистанции можно считать, что один шаг равен 75 см.
    Для подсчёта количества сожжённых килокалорий можно считать, что 1 шаг = 50 калорий, 1 килокалория = 1 000 калорий.*/

            public double distance (int steps) {
                int distance = 0;
                distance = steps * 0.75;
                return distance;
            }

            public int countCalories (int steps) {
            int kCals = 0;
            kCals = (steps * 50) / 1000;
            return kCals;
        }
}