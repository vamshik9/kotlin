//Abstract class is a class that you cannot create an object of directly
//It is designed to be inherited by other class

abstract class Animal{

    abstract fun sound()
}

class Dog : Animal(){

    override fun sound(){
        println("Dog sound barks")

    }
}

fun main(){
    val d = Dog()
    d.sound()
}
//Dog sound barks
