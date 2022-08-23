package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double max = Math.max(firstSide, Math.max(secondSide, thirdSide));
        double sum = 0;
        if (max == firstSide)
            sum = secondSide + thirdSide;
        else if (max == secondSide)
            sum = firstSide + thirdSide;
        else
            sum = firstSide + secondSide;

        if (sum >= max) {
            System.out.println("this is a valid triangle");
            return;
        }
        System.out.println("it's not a triangle");
    }
}