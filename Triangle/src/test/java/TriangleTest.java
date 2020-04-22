import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TriangleTest {

    @Test
    public void checkTrueTest() throws Exception {
        Assertions.assertTrue(TriangleCheck.check(5.69, 3.71, 5));
    }

    @Test
    public void checkTrueTestRectangle() throws Exception {
        Assertions.assertTrue(TriangleCheck.check(3, 4, 5));
    }
    @Test
    public void checkTrueTestEqualSides() throws Exception {
        Assertions.assertTrue(TriangleCheck.check(5.85, 5.85, 4));
    }
    @Test
    public void checkTrueTestWithEquals() throws Exception {
        Assertions.assertTrue(TriangleCheck.check(6, 6, 6));
    }


    @Test
    public void checkFalseTest() throws Exception {
        try{
            Assertions.assertFalse(TriangleCheck.check(1, 1, 2));
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void checkFalseTestWithZero() throws Exception {
        try{
            TriangleCheck.check(0, 1, 2);
        }catch (Exception e){
            String expected = "Values equal or less then 0 are not allowed!";
            String actual = e.getMessage();
            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void checkFalseTestWithAllZero() throws Exception {
        try{
            TriangleCheck.check(0, 0, 0);
        }catch (Exception e){
            String expected = "Values equal or less then 0 are not allowed!";
            String actual = e.getMessage();
            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void checkFalseTestNegative() throws Exception {
        try{
            TriangleCheck.check(-3,3 , 5);
        }catch (Exception e){
            String expected = "Values equal or less then 0 are not allowed!";
            String actual = e.getMessage();
            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void checkFalseTestAllNegative() throws Exception {
        try{
            TriangleCheck.check(-3,-4 , -5);
        }catch (Exception e){
            String expected = "Values equal or less then 0 are not allowed!";
            String actual = e.getMessage();
            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void checkFalseTestNegativeAndZero() throws Exception {
        try{
            TriangleCheck.check(-3,0 , -5);
        }catch (Exception e){
            String expected = "Values equal or less then 0 are not allowed!";
            String actual = e.getMessage();
            Assertions.assertEquals(expected, actual);
        }
    }
}
