//super

open class Animal{

    open fun sound(){
        println("Animal sound")
    }
    open fun eat(){
        println("Animal eating")
    }
}

class Dog : Animal(){

    override fun sound(){
        super.eat()                     //function defined in the parent class
        super.sound()                   //calls parent class sound and child class
        println("Dog sound barks")

    }
}

fun main(){
    val d = Dog()
    d.sound()
}
/*OUTPUT
Animal eating
Animal sound
Dog sound barks

*/
