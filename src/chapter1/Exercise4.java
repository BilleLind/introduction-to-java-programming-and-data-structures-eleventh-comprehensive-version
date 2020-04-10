package chapter1;

public class Exercise4 {
    public static void main(String[] args) {
        table();
    }

    public static void table() {
        String space = "      ", space2 = "     ", space3 = "    ";
        System.out.println("a" + space + "a^2" + space3 + "a^3" + space3 + "a^4\n" +
                "1" + space + "1" + space + "1" + space + "1\n" +
                "2" + space + "4" + space + "8" + space + "16\n" +
                "3" + space + "9" + space + "27" + space2 + "81\n" +
                "4" + space + "16" + space2 + "64" + space2 + "256");
    }
}
