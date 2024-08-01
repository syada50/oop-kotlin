package constructor

class fruit_secondary {
    var name: String = ""
    var color : String = ""
    var size: String= ""


    constructor(name: String)

    constructor(name: String, color: String ){
        this.name = name
        this.color = color

    }

    constructor(name: String, color: String , size: String ){
        println("Name: $name, Color: $color, Size: $size")
    }

}