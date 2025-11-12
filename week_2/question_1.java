package week_2;

public class question_1 {
    public static void swapVariables(int a, int b){
        System.out.println("Without swap: a = " + a + " b = " + b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + " b = " + b);
    }
}
