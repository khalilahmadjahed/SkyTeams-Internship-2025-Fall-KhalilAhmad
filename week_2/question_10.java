package week_2;
public class question_10 {
    public static String checkLeapYear(int year){
        String result;
        if (year < 0) {
            return "Enter a valid year";
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    result = "Leap Year";
                }else{
                    result = "Not Leap Year";
                }
            }else{
                result = "Leap Year";
            }
        }else{
            result = "Not Leap Year";
        }
        return result;
    }
}
