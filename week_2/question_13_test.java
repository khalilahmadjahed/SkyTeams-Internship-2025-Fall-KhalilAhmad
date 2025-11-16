package week_2;

public class question_13_test {
    public static void main(String[] args) {
        String result = question_13.takeNameAndNumberOfDays(0);
        System.out.println(result);
        
         result = question_13.takeNameAndNumberOfDays(-1);
        System.out.println(result);
        
        result = question_13.takeNameAndNumberOfDays(1);
        System.out.println(result);
        
        result = question_13.takeNameAndNumberOfDays(5);
        System.out.println(result);
        
        result = question_13.takeNameAndNumberOfDays(7);
        System.out.println(result);
        
    }
}
