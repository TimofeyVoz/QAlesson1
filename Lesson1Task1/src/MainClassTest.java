import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber(){

        int expected = 14;
        int actual = getLocalNumber();
        Assert.assertTrue("Method getLocalNumber doesn't return number 14", expected==actual );
        System.out.println("Method getLocalNumber return number 14");
    }
}
