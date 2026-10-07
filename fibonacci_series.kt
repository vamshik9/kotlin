//Fibonacci Series
fun main(){

    var a = 0
    var b = 1
    for(i in 1..10){
        val temp = a
        a = a + b
        b = temp
        println(b)
    }
}
