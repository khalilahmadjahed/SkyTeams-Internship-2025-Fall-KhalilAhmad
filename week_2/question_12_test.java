package week_2;

public class question_12_test {
    public static void main(String[] args) {
        String result = question_12.DetectState("null");
        System.out.println(result);
        
        result = question_12.DetectState("Red");
        System.out.println(result);

        result = question_12.DetectState("RED");
        System.out.println(result);

        result = question_12.DetectState("YeLLow");
        System.out.println(result);

        result = question_12.DetectState("yellow");
        System.out.println(result);

        result = question_12.DetectState("green");
        System.out.println(result);

        result = question_12.DetectState("Ahmad");
        System.out.println(result);

    }
    
}
