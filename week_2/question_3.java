package week_2;

public class question_3 {
    public static double[] areaPerimeter(double width, double heigth){
        double area = width * heigth;
        double perimeter = 2 * (width + heigth);
        return new double[]{area, perimeter};

    }
}
