package week_2;

public class question_8 {
    public static String checkPosNegZero(int number){
        String result;
        if (number > 0) {
            result = "Positive";
        }else if (number < 0 ) {
            result = "Negative";
        }else{
            result = "Zero";
        }
        return result;
    }
}
