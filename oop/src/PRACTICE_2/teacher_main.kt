package PRACTICE_2

fun main () {

    var teacher = TEACHER()         //null constructor calling command
    teacher.name="yasmin"          //name is assigned
    teacher.id="123"               //id is assigned
    teacher.address="Dhaka"        //address is assigned
    teacher.display()

    var student = student()
    //no data is assigned here thats why it gives "no data" output
    student.display()

}