import org.junit.Assert;
import org.junit.Test;

public class MultiAddTest {
    MultiAdd add = new MultiAdd();

    @Test
    public void multiADDTest(){
        double expected = 13.4;
        double actual = add.multiAdd(5.2,2.0,3.0);

        Assert.assertEquals(expected,actual,0.0);
    }
}
