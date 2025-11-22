package week_2;

public class question_17 {
    public static int calSum(int n){
        
        int total = 0;
        if (n > 0) {
            total = (n * (n+1) / 2);    
        }
        else{
            total = -1;
        }

        return total;
        
    }
}
