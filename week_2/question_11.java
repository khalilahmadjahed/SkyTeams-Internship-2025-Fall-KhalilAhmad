package week_2;

public class question_11 {
    public static double calculate(double a, double b, char sign){
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' ) {
            double result = 0;
            switch (sign) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a-b;
                    break;
                case '*':
                    result = a*b;
                    break;
                case '/':
                    try {
                        result = a/b;
                    } catch (ArithmeticException e) {
                        e.getMessage();
                    }
                    break;
            }
            return result;
        }else{
            throw new IllegalArgumentException("Invalid operator " + sign);
        }
    }
}
