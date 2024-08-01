
import java.util.*

fun main(args: Array<String>) {
    var N :Int = readLine()!!.toInt()
    var H: Int = N/3600
    N=N%3600
    var M: Int =N/60
    var s: Int =N%60
    println("$H:$M:$s")
}