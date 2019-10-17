import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void isTriangleTest(){
      boolean result = triangle.isTriangle(7,10,5);

        Assert.assertTrue(result);
    }
}
