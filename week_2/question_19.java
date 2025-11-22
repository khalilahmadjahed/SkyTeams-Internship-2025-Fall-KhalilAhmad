package week_2;

public class question_19 {
    public static int reverse(int number){
        String number_str = String.valueOf(number);
        String newNumber = "";

        for(int i = number_str.length()-1; i >= 0; i--){
            newNumber += number_str.charAt(i);
        }

        return Integer.parseInt(newNumber);
    }
}
