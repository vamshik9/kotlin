fun main(){
    var i =1
    //Print 1 to 10
    while(i <= 10){
        println("number $i")
        i++
    }
    //Print even numbers
    var a = 0
    while(a <= 10){
        if(a%2==0){
            println("even number $a")
        }
        a++
    }
    //sum of numbers
    var x = 0
    var sum = 0

    while(x <= 10){
        sum += x
        x++
    }
    println("sum = $sum")



}
