import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void isTriangleTest(){
        boolean result = triangle.isTriangle(7,10,5);

        Assert.assertTrue(result);
    }

    @Test
    public void isTriangleTest1(){
        boolean result = triangle.isTriangle(1,10,5);

        Assert.assertFalse(result);
    }
}
