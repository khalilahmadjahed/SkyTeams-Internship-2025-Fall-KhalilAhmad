package week_2;

public class question_15 {
    public static String validateTriangle(int s1, int s2, int s3){
        String result = "";

        if (s1+s2 > s3 && s2+s3 > s1 && s1+s3 > s2) {
            result = "Valid Triangle";
            if (s1 == s2 && s1 == s3 && s2 == s3) {
                result += ", equilateral";
            }
            else if(s1 == s2 || s2 == s3 || s1 == s3){
                result += ", Isosceles";
            }
            else{
                result += ", Scalene";
            }
        }
        else{
            result = "Invalid Triangle";
        }
        return result;
    }
}
