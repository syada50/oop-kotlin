package conditions
fun main (){
    var a=7
    var b=6
    var c=7
    if( a>b && a>c){
        println("a is greater")
    }
    else if (b>a && b>c) {
        println("b is greater")
    }
    else if ( c>a && c>b){
        println("c is greater")
    }
    else if ( a==b && a>c){
        println("a snd b are equal")
    }
    else if ( a==c && a>b){
        println("a snd c are equal")
    }
    else if(b==c && b>a){
        println("b and c are equal")
    }
    else {
        println("all are equal")
    }
}