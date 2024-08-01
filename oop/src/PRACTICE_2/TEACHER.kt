package PRACTICE_2

class TEACHER {
    var name: String = ""
    var id: String = ""
    var address: String= ""

    constructor(){
    }
    constructor(name: String ) {
        this.name = name
    }
    constructor(name: String, id: String) {
        this.name= name
        this.id= id
    }
    constructor(name: String, id: String , address: String ){
        this.name= name
        this.id = id
        this.address = address
    }

    fun display() {
      if (name.equals("") && id.equals("") && address.equals("")){
          println("no data")
      }
      else if (id.equals("") && address.equals("")){
          println("Name: $name")
      }
      else if ( address.equals("")){
          println("Name:$name, Id:$id")
      }
      else {
          println("name:$name, Id : $id, Address: $address")
      }
  }
}

