package week_2;

public class question_18 {
    public static void multiply(int number){
        int multiplication = 0;
        for(int i = 1; i <= 10; i++){
            multiplication = i * number;
            System.out.println(i + " * " + number + " = " + multiplication);
        }
    }
}
