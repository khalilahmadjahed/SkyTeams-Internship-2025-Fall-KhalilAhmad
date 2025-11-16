package week_2;

public class question_16 {
    public static String showNumbers(){
        String result = "1";
        for(int i = 2; i <= 100; i++){
            result += ", "+i;  
        }
        return result;
    }
}
