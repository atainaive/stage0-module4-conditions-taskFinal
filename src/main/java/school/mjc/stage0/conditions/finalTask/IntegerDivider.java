package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        if (dividend == (dividend / divider) * divider) {
            System.out.println("can be divided completely");
            return;
        }

        System.out.println("cannot be divided completely");
    }
}