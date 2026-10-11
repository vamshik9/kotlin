//inheritance

open class Vehicle{
    open val brand :String = "TATA"

    fun start(){
        println("Vehicle is starting....")
    }
}

class Car:Vehicle(){
    override val brand :String= "BMW"
}

fun main(){
    val c1 = Car()
    println(c1.brand)
    c1.start()
}
//Output:
//BMW
//Vehicle is starting....
