import org.junit.Assert;
import org.junit.Test;

public class DivisibleTest {
    Divisible divisible = new Divisible();

    @Test
    public void isDivisibleTest(){
        Boolean result = divisible.isDivisible(9,3);
        Assert.assertTrue(result);
    }

    @Test
    public void isDivisibleTest1(){
        Boolean result = divisible.isDivisible(9,2);
        Assert.assertFalse(result);
    }
}
