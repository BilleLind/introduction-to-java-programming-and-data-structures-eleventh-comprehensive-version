package chapter1;

public class Exercise12 {

    public static void main(String[] args) {
        //enter each value with .0
        averageSpeedInKilometers(1.0,40.0,35.0);
    }
    public static void averageSpeedInKilometers(double hour, double minute, double second) {
        double mile = 24;
        double kilometer = mile *1.6;

        double hourMinuteSeconds = ((hour * 60.0 * 60.0 + minute * 60.0 + second) / (60.0 * 60.0));
        double kilometerPerHour = kilometer / hourMinuteSeconds;
        System.out.println(kilometerPerHour);
    }

}
