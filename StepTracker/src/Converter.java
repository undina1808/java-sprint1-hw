public class Converter {

    public double distance(int steps) {
        double distance = 0;
        distance = steps * 0.75;
        return distance;
    }

    public int countCalories(int steps) {
        int kCals = 0;
        kCals = (steps * 50) / 1000;
        return kCals;
    }
}