package chapter1;

public class Exercise11 {
    static int birth = 7, death = 13, immigrant = 45;
    // day = 86400, year = 31 536 000
    public static void main(String[] args) {
        populationProjection();
    }
    public static void populationProjection() {
        int seconds = 0, year = 31536000;
        long alive = 312032486;
       for (int i = 0; i<=5; i++) {
        String day = "Day : ";
           System.out.println(day + i +" = "+alive);
          seconds = 0;
        for (seconds = 1; seconds <=year+1; seconds++) {
            if (seconds % birth == 0) { // 4505142
                alive++;
            }
            if (seconds % death == 0) { //2425846
                alive--;
            }
            if (seconds % immigrant == 0) { //700800
                alive++;
            }
        }
         } //314.812.582
    }
}
