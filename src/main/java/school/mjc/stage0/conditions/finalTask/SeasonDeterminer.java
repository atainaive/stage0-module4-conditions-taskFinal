package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number");
            return;
        }
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Winter");
            return;
        }
        if (monthNumber < 6) {
            System.out.println("Spring");
            return;
        }
        if (monthNumber < 9) {
            System.out.println("Summer");
            return;
        }
        System.out.println("Autumn");
    }
}