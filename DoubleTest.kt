import java.math.BigDecimal

fun main() {
    // https://docs.oracle.com/javase/9/docs/api/java/lang/Double.html
    // double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
    println("Using Double")

    val dValue = 15.25
    val dResult = dValue * 1.15
    println("15.25 plus 15%: $dResult")
    println("15.25 plus 15% correct result 17.5375")


    // float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    println("Using Float")

    val fValue = 15.25f
    val fResult = fValue * 1.15f
    println("15.25 plus 15%: $fResult")
    println("15.25 plus 15% correct result 17.5375")


    println("\nUsing BigDecimal")

    val bdValue = BigDecimal("15.25")
    val bdPerc = BigDecimal("1.15")
    val bdResult = bdValue.multiply(bdPerc)
    println("15.25 plus 15%: " + bdResult.toDouble())
    println("15.25 plus 15% correct result 17.5375")
}
