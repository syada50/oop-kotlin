package functions

fun main() {
    sum2( 10, 20)
    sum2(30, 40)
    sum2(60, 70)

}
fun sum2(a:Int, b: Int){
    var sum = a+b
    println("Sum of $a and $b is $sum")
}