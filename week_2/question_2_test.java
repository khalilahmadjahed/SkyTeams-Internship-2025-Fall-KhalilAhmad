package week_2;

public class question_2_test {
    public static void main(String[] args) {
        int[] result1 = question_2.findMaxMin(10, 5, 8);
        System.out.println("Test1: max: " + result1[0] + ", min: " + result1[1]);

        int[] result2 = question_2.findMaxMin(-6, -1, -8);
        System.out.println("Test1: max: " + result2[0] + ", min: " + result2[1]);

        int[] result3 = question_2.findMaxMin(-1, 5, 0);
        System.out.println("Test1: max: " + result3[0] + ", min: " + result3[1]);
        
    }
    
} 
