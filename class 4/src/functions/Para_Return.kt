package functions

fun main(){
    println(sum3(10, 20))
    var r = sum3(39, 51)
    println(r)

    var add = 20 + sum3(90, 20)
    println(add)
}
 fun sum3(a:Int, b:Int): Int {
     var sum = a + b
     return sum
 }