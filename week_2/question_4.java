package week_2;

public class question_4 {
    public static double[] convertTemperature(double c, double f){

        double celsius = (f - 32) * 5 / 9;
        double fahrenheit = (c * 9 / 5) + 32;

        return new double[]{celsius, fahrenheit};
    }
}
