public class Converter {

    public double countDistance(int steps) {
        return (steps * 0.00075);
    }

    public double countCalories(int steps) {
        return (steps * 50) / 1000;
    }
}