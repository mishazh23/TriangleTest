public class TriangleCheck {
    public static boolean check(double a, double b, double c) throws Exception {
        if ((a > 0) && (b > 0) && (c > 0)){
            return ((a + b > c) && (a + c > b) && (b + c > a));
        }
        else{
            throw new Exception("Values equal or less then 0 are not allowed!");
        }
    }
}
