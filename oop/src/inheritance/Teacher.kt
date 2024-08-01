package inheritance


class Teacher (name: String, age: Int, gender: String,var teacherid: Int, var subject: String): person(name, age, gender) {

    fun display (){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Teacher id: $teacherid")
        println("Subject: $subject")
    }
}