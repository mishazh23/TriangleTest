import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;


public class TriangleTest {


    @Test
    public void checkTrueTestRectangle() throws Exception {
        Assert.assertTrue(TriangleCheck.check(3, 4, 5));
    }
    @Test
    public void checkTrueTest() throws Exception {
        Assert.assertTrue(TriangleCheck.check(5.85, 5.85, 4));
    }
    @Test
    public void checkTrueTestWithEquals() throws Exception {
        Assert.assertTrue(TriangleCheck.check(6, 6, 6));
    }


    @Test
    public void checkFalseTest() throws Exception {
        try{
        Assert.assertFalse(TriangleCheck.check(1, 1, 2));
    }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void checkFalseTestWithZero() throws Exception {
        try{
            Assert.assertFalse(TriangleCheck.check(0, 1, 2));
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void checkFalseTestNegative() throws Exception {
        try{
            Assert.assertFalse(TriangleCheck.check(-3,3 , 5));
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
