package andrii.shlapachenko.mortalwombat;

public class AgeChecker {
    private final int MIN_AGE = 21;


    public boolean CanPlayGame(int age) {

        return age >= MIN_AGE;
    }
}
