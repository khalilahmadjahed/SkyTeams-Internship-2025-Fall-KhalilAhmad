package week_2;

public class question_2
 { 
    public static int[] findMaxMin(int num1, int num2, int num3) {
        int max, min;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }

        return new int[]{max, min};
    }
}
