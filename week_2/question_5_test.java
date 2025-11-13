package week_2;

public class question_5_test {
    public static void main(String[] args) {
        double[] computeInterests = question_5.computeSimpleAndCompoundInterest(1000, -5, 2);
        if (computeInterests[0] == -1) {
            System.out.println("Please Enter valid numbers");
        }else{
            System.out.println("Simple Interest = " + computeInterests[0] + " Compund Interst = " + computeInterests[1]);
        }
        
        computeInterests = question_5.computeSimpleAndCompoundInterest(500, 4, -2);
        if (computeInterests[0] == -1) {
            System.out.println("Please Enter valid numbers");
        }else{
            System.out.println("Simple Interest = " + computeInterests[0] + " Compund Interst = " + computeInterests[1]);
        }
        
        computeInterests = question_5.computeSimpleAndCompoundInterest(1000, 5, 2);
        if (computeInterests[0] == -1) {
            System.out.println("Please Enter valid numbers");
        }else{
            System.out.println("Simple Interest = " + computeInterests[0] + " Compund Interst = " + computeInterests[1]);
        }


    }
}
