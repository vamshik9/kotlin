fun main(){

    for( i in 1..10){
        println(i)
    }
    for( a in 10 downTo 1)
        println(a)

    for(b in 1..20){
        if(b % 2 == 0){
            println("Even:$b")
        }
        else {
            println("Odd:$b")
        }
    }

    for(c in 1..3){
        for(d in 1..10){
            println("$c * $d = ${c*d}")
        }
    }
}
