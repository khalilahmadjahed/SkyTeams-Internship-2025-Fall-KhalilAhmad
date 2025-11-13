package week_2;

public class question_6 {
    public static double[] convertHrMinSec(int sec){
        if (sec < 0) {
            return new double[]{-1};
        }
        int hr = sec / 3600;

        sec %= 3600;
        int min = sec / 60;

        sec %= 60;
        int secondsRemaining = sec;

        return new double[]{hr,min,secondsRemaining};
    }
}
