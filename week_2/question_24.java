package week_2;

public class question_24 {
    public static int findGCD(int num1, int num2){
        int max;
        int min;

        if (num1 >= num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        while (min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }

        // max is the GCD
        return max;
    }
}
