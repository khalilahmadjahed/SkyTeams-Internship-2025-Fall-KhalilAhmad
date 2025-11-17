package week_2;

public class question_21 {
    public static int sumOfDigits(int number){
        int length = String.valueOf(number).length();
        int total = 0;

        for(int i = 0; i < length; i++){
            int mod = number % 10;
            total += mod;

            number /= 10;
        }
        return total;
    }
}
