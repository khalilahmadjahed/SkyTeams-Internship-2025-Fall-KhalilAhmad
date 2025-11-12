package week_2;

public class question_4_test {
    public static void main(String[] args) {
        double[] temperatureConvertor = question_4.convertTemperature(-40, -40);
        System.out.println("Celsius= " + temperatureConvertor[0] + " / Fahrenheit = " + temperatureConvertor[1]);

        temperatureConvertor = question_4.convertTemperature(25, 77);
        System.out.println("Celsius= " + temperatureConvertor[0] + " / Fahrenheit = " + temperatureConvertor[1]);

        temperatureConvertor = question_4.convertTemperature(0, 90);
        System.out.println("Celsius= " + temperatureConvertor[0] + " / Fahrenheit = " + temperatureConvertor[1]);
        
    }
    
}
