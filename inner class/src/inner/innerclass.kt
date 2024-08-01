package inner

class innerclass {
    var name: String="yasmin"
    inner class Inner {

        fun display(){
            println(name)
        }
    }
}
fun main (){
    val out = innerclass()
    val inner =out.Inner()
    inner.display()
}
