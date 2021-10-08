import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber(){

        int expected = 45;
        int actual = getClassNumber();
        Assert.assertTrue("Method getClassNumber doesn't return number > 45", actual> expected );
        System.out.println("Method getClassNumber return number > 45");
    }
}
