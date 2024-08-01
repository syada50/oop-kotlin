package conditions

fun main (){
    println("take a number :")
    var a= readLine()!!.toInt()

    // true if num is perfectly divisible by 2
    if(a % 2 == 0) {
        println("this is Even")
    }
    else {
        println("this is Odd")
    }
}