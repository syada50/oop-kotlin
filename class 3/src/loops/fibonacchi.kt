package loops

fun main(){
    var a = 0
    var b = 1
   var n = 0
    for (i in 1..9)
    { println("$a")
        n=a+b
        a=b
        b=n
    }

}