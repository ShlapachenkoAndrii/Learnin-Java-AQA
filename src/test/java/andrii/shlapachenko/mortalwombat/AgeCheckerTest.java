package andrii.shlapachenko.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.CanPlayGame(21), "Aged user can't play game");

    }

    @Test
    public void testThatTooYoungUsersCanNotPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.CanPlayGame(19), "User can play the game");
    }


}
