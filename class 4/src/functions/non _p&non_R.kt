package functions

fun main(){
  sum()         // function  sum() have been called here once only

}
fun sum(){
    var a= 10
    var b= 20
    var sum = a+b
    println("sum of $a and $b is $sum")
}
    // as it is non return so it will return no value