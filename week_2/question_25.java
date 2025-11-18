package week_2;

public class question_25 {
    public static int findLCM(int a, int b){
        int gcd = question_24.findGCD(a, b);
        return a * b / gcd;
    }
}
