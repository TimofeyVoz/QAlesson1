import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString(){

        String expected1 = "hello";
        String expected2 = "Hello";
        String actual = getClassString();
        Assert.assertTrue("Method getClassString doesn't contain \"hello\" or \"Hello\"", actual.contains(expected1) ||  actual.contains(expected2));
        System.out.println("Method getClassString contain \"hello\" or \"Hello\"");
    }
}
