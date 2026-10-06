fun main(){
    val a = 10
    val b = 5

    print("Enter the operator: ")
    val operator = readln()

    when (operator){
        "+" -> println("add a+b=${a+b}")
        "-" -> println("sun a-b=${a-b}")
        "*" -> println("mul a*b=${a*b}")
        "/" -> println("div a/b=${a/b}")
        else -> println("unknown operator")

    }


}
