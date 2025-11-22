package week_2;

import java.util.ArrayList;
import java.util.List;

public class question_22 {
    public static List<Integer> printEven(int start, int end){
        List<Integer> evenNumbers = new ArrayList<>();

        for(int i = start; i <= end; i++){
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
