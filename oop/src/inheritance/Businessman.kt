package inheritance

class Businessman (name: String, age: Int, gender: String, var salary: Double): person(name, age, gender) {

    fun display (){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("salary: $salary")
    }
}