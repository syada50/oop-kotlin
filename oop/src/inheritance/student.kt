package inheritance

class student (name: String, age: Int, gender: String, var studentid: Int): person(name, age, gender) {

    fun display (){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Student id: $studentid")
    }
}