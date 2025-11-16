package week_2;

public class question_12 {
    public static String DetectState(String color){
        String state = "";
        switch (color.toLowerCase()) {
            case "red":
                state = "Stop";
                break;
        
            case "yellow":
                state = "Ready";
                break;
              
            case "green":
                state = "Go";
                break;
    
            default:
                state = "Enter a light";
                break;
        }
        return state;
    }
}
