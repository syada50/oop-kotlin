package conditions

fun main () {
    var a= readLine()!!.toInt()
    when (a%2){
        0-> println(" $a is even")
        1-> println("$a is odd")
    }
}
