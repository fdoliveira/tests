import java.math.*;

public class DoubleTest {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        System.out.println( "Using Primitive double");

        double dValue = 15.25;
        double dResult = dValue * 1.15;
        System.out.println( "15.25 plus 15%: " + dResult );
        System.out.println( "15.25 plus 15% correct result 17.5375");

        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        System.out.println( "\nUsing Primitive float");

        float fValue = 15.25f;
        float fResult = fValue * 1.15f;
        System.out.println( "15.25 plus 15%: " + fResult );
        System.out.println( "15.25 plus 15% correct result 17.5375");

        // https://docs.oracle.com/javase/9/docs/api/java/lang/Double.html
        System.out.println( "\nUsing Class Double");

        Double dcValue = 15.25;
        Double dcResult = dcValue * 1.15;
        System.out.println( "15.25 plus 15%: " + dcResult );
        System.out.println( "15.25 plus 15% correct result 17.5375");

        // https://docs.oracle.com/javase/9/docs/api/java/math/BigDecimal.html
        System.out.println( "\nUsing BigDecimal");
        
        BigDecimal bdValue = new BigDecimal("15.25");
        BigDecimal bdPerc = new BigDecimal("1.15");
        BigDecimal bdResult = bdValue.multiply(bdPerc);
        System.out.println( "15.25 plus 15%: " + String.valueOf(bdResult.doubleValue()));
        System.out.println( "15.25 plus 15% correct result 17.5375");
    }
}
