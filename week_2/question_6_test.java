package week_2;

public class question_6_test {
    public static void main(String[] args) {
        
        double[] convertTimeSections = question_6.convertHrMinSec(3665);
        if (convertTimeSections[0] == -1) {
            System.out.println("Enter valid seconds!");
        }else{
            System.out.println("hr = " + convertTimeSections[0] +  " / min = " + convertTimeSections[1] + " / sec " + convertTimeSections[2]);
        }

        convertTimeSections = question_6.convertHrMinSec(-3665);
        if (convertTimeSections[0] == -1) {
            System.out.println("Enter valid seconds!");
        }else{
            System.out.println("hr = " + convertTimeSections[0] +  " / min = " + convertTimeSections[1] + " / sec " + convertTimeSections[2]);
        }
    }
}
