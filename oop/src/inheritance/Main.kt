package inheritance

fun main(){
    var s = student("yasmin",24,"female",2345)
    s.display()
    println()


    var t= Teacher ("abc",30,"male",200, "ict")
    t.display()
    println()

    var b=Businessman("AC", 40, "male",60000.0 )
    b.display()
}