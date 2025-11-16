package week_2;

public class question_13 {
    public static String takeNameAndNumberOfDays(int no){
        String monthAndNumberOfDays = "";
        switch (no) {
            case 1:
                monthAndNumberOfDays = "January, 31 days";
                break;
            case 2:
                monthAndNumberOfDays = "February, 28 or 29 days";
                break;
            
            case 3:
                monthAndNumberOfDays = "March , 31 days";
                break;

            case 4:
                monthAndNumberOfDays = "April , 30 days";
                break;

            case 5:
                monthAndNumberOfDays = "May , 31 days";
                break;

            case 6:
                monthAndNumberOfDays = "June , 30 days";
                break;

            case 7:
                monthAndNumberOfDays = "July , 31 days";
                break;

            case 8:
                monthAndNumberOfDays = "August , 31 days";
                break;

            case 9:
                monthAndNumberOfDays = "September , 30 days";
                break;

            case 10:
                monthAndNumberOfDays = "October , 31 days";
                break;

            case 11:
                monthAndNumberOfDays = "November , 30 days";
                break;

                case 12:
                monthAndNumberOfDays = "December , 31 days";
                break;
            default:
                monthAndNumberOfDays = "Enter a number between range of 1 - 12";
                break;
        }
        return monthAndNumberOfDays;
    }
}





