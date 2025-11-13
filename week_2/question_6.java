package week_2;

public class question_6 {
    public static String[] convertHrMinSec(int sec){
        int hr = sec / 3600;

        sec %= 3600;
        int min = sec / 60;

        sec %= 60;
        int secondsRemaining = sec;

        return new String[]{"Hr = " + hr, " / Min = " + min, " / Sec = " + secondsRemaining};
    }
}
