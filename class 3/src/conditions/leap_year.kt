package conditions


// this program checks leap year
import java.util.Scanner
fun main (){
    var scan =Scanner(System.`in`)
    var y = scan.nextInt()

    if (y%400==0 || y%4==0 && y%100!==0){
        println("this year is leap year")
    }

    else {
        println("the year is not leap year")
    }
}
