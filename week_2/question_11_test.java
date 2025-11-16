package week_2;

public class question_11_test {
    public static void main(String[] args) {
        double calculator = question_11.calculate(5, 8, '+');
        System.out.println(calculator);

        calculator = question_11.calculate(5, 8, '-');
        System.out.println(calculator);

        calculator = question_11.calculate(5, 8, '*');
        System.out.println(calculator);

        calculator = question_11.calculate(5, 0, '/');
        System.out.println(calculator);

        calculator = question_11.calculate(5, 8, '/');
        System.out.println(calculator);

        calculator = question_11.calculate(5, 8, '|');
        System.out.println(calculator);
    }
    
}
