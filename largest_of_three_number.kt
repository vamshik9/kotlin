fun main(){

    println("a :")
    val a = readln().toInt()
    println("b :")
    val b = readln().toInt()
    println("c :")
    val c = readln().toInt()

    if(a >= b && a >= c){
        println("a is largest number")
    }
    else if(b >= a && b >= c){
        println("B is largest number")
    }
    else {
        println("c is largest number")
    }

}
