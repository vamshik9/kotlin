//Safe call operator 
//?.

fun main(){

    var name : String? = null

    //println(name.legth)     //error because name might be null
    println(name?.length)    //safe call operator
}
