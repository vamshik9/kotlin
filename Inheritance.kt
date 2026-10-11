//inheritance

open class Vehicle{
    val brand :String = "TATA"

    fun start(){
        println("Vehicle is starting....")
    }
}

class Car:Vehicle()

fun main(){
    val c1 = Car()
    println(c1.brand)
    c1.start()
}
