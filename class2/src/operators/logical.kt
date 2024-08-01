package operators

fun main() {
    var a= 10
    var b=5
    //logical and
    println(a>b && b>a)   //all the conditions have to be true to get true
    //logical or
    println(a>b || b<a)   // at least 1 condition have to be true
    // logical not
    println(!(a>b))       // output result will be opposite of the given condition

}