package week_2;
public class question_5 {
    public static double[] computeSimpleAndCompoundInterest (double principle, double rate, double Time){
        if (principle < 0 || rate < 0 || Time < 0) {
            return new double[]{-1};
        }

        double simpleInterest = (principle * rate * Time) / 100;

        double amount = principle * Math.pow((1+rate/100), Time);
        double compoundInterest =  amount - principle;

        return new double[]{simpleInterest, compoundInterest};
    }
}
