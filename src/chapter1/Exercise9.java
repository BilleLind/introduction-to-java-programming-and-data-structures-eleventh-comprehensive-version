package chapter1;

public class Exercise9 {

    public static void main(String[] args) {
        perimeter(5.3, 8.6);
    }
    public static void perimeter(double width, double heigth) {
        double area = width * heigth;
        double perimeter = 2 * (width +heigth);
        System.out.println("Perimeter = " + perimeter + "\n" +
                "Area = " +area);
    }
}
