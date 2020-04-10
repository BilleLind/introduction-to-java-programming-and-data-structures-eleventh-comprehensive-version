package chapter1;

public class Exercise7 {

    public static void main(String[] args) {
        pi1();
        pi2();
    }
    public static void pi1() {
        double result = 4 * (1.0-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);
    }
    public static void pi2() {
        double result = 4 * (1.0-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
        System.out.println(result);
    }
}
