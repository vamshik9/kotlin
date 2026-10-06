fun main(){
    println("Enter Year:")

    val year = readln().toInt()

    if (year % 400 == 0 || (year % 4 ==0 && year %100 != 0)){
        println("Yes, It's a leep year")
    }
    else{
        println("No, Not a leep year")
    }

}
