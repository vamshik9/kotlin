class Car(val brand: String,val year:Int){
    init {
        println ("We using 'init block' so it will automatically called when we create a class")
    }
    fun details(){
        println("car details brand:$brand  year:$year")
    }
}

fun main(){
    val c = Car("TATA",1999)
    c.details()
}
