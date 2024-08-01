package user_input


// this program shows the way of taking manual input/user input

import java.util.Scanner
fun main () {
    var scan =Scanner(System.`in`)
    var a= scan.nextInt()
    var b= scan.nextInt()
    var sum = a+b
    println(sum)
}
//........................................
/*
// there is another way to do the same thing


var a = readLine()!!.toInt
   var b= readLine()!!.toInt


//....................................................


import java.util.Scanner

 fun main () {
  var a= scan.next()
  var b= scan.nextLine()
//var sum = a+b
   println(a)
   println(b)
}

 */