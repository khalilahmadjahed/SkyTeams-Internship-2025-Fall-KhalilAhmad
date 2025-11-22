package week_2;

import java.util.ArrayList;
import java.util.List;

public class question_23 {
    public static List<Integer> findFibonacci(int number){

        List<Integer> numbers = new ArrayList<>();

        if (number <= 0) {
            return numbers;
        }

        int num1 = 0;
        int num2 = 1;

        numbers.add(num1);
        if (number == 1) {
            return numbers;
        }

        numbers.add(num2);

        for(int i = 2; i < number; i++){
            int num3 = num1 + num2;
            numbers.add(num3);

            num1 = num2;
            num2 = num3;
        }

        return numbers;
    }

}
