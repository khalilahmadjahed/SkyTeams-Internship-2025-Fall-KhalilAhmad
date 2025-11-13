package week_2;

public class question_9 {
    public static String calcGrade(int grade){
        String result;
        if (grade <= 100 && grade >= 0) {
            if (grade >= 85) {
                result = "A";
            }else if (grade >= 75) {
                result = "B";
            }else if(grade >= 55){
                result = "D";
            }else{
                result = "F";
            }
        }else{
            result = "The grade should be between 0 - 100";
        }
        return result;
    }
}
