class Student(val name:String, val age:Int, var phone:Int?)


fun main(){
    //example 1
    val surname: String = "Kyatham"
    //surname = null                //error

    var surname1: String? = "Kyatham"

    println("Surname1: $surname1")
    surname1 = null
    println("Surname1: $surname1")



    val s1 = Student("Vamshi",27,null)

    println(s1.phone)
}
