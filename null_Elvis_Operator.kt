//?:  Elvis operator

fun main(){

    val name:String? = null

    val result = name?: "Guest"

    println(result)
}

//Output
//Guest
/*
Why?

name is null.

Therefore, Kotlin chooses "Guest".
 */

fun main(){
    val name:String = "Vamshi"

    val result = name?: "Guest"

    println(result)
}
/*
output:
    Vamshi

 Because name already has a value, Kotlin doesn't use "Guest".
 */
