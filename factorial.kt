fun main(){
    print("Enter a number: ")
    val num = readln().toInt()
    var factorial = 1

    for(i in 1..num){
        factorial *= i
    }
    println(factorial)
}
