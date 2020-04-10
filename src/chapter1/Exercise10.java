package chapter1;

public class Exercise10 {

    public static void main(String[] args) {
    averageSpeedInMiles();
    }
    public static void averageSpeedInMiles() {
        double kilometers = 15;
        double miles = kilometers / 1.6;

        double hourMinuteSecond = ((50.0 * 60.0 + 30.0) / (60.0 *60.0));
        double milesPerHour = miles / hourMinuteSecond;

        System.out.println(milesPerHour);
    }
}
