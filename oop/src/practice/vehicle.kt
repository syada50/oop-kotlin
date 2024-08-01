package practice


class vehicle  (var model: String, var brand:String, var engine:String, var seat: String, var madeIn :String) {

    init {
        println("model:$model")
        println("Brand:$brand")
        println("Engine: $engine")
        println("Seat: $seat")
        println("madeIn: $madeIn")

    }

 fun horn(){
     println("sound is Pip Pip Pip")
 }

}
