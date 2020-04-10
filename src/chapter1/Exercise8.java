package chapter1;

public class Exercise8 {
    static double pi = 3.14159;
    public static void main(String[] args) {
        perimeter(6.5);
    }
    public static void perimeter(double radius) {
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.println("Perimeter = " + perimeter + "\n" +
                "Area = " + area);
    }
}
