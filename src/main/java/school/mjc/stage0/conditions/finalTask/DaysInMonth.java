package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || (month < 1 || month > 12)) {
            System.out.println("invalid date");
            return;
        }

        int[] biggestMontNo = {1, 3, 5, 7, 8, 10, 12};
        for (int tempMont : biggestMontNo) {
            if (month == tempMont) {
                System.out.println(31);
                return;
            }
        }

        if (month == 2) {
            System.out.println(((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) ? 29 : 28);
            return;
        }

        System.out.println(30);
    }
}