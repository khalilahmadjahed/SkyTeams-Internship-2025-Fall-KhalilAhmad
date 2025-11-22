package week_2;

public class question_17_test {
    public static void main(String[] args) {
        if(question_17.calSum(-1) < 1){
            System.out.println("Please Enter a number greater than zero!!!!");
        }
        System.out.println(question_17.calSum(3));
        System.out.println(question_17.calSum(4));
        System.out.println(question_17.calSum(5));
    }
}
