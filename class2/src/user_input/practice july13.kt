package user_input

import java.util.Scanner

fun main () {
    var scan =Scanner(System.`in`)
    var a= scan.nextInt()
    var b= scan.nextInt()
    var sum = a+b
    println("sum= $sum")

    var sub = a-b
    println("sub = $sub")

    var mult = a*b
    println("Mult = $mult")

    var div = a/b.toDouble()

    println("Div = $div")

    var mod = a%b
    println("Mod = $mod")
}

