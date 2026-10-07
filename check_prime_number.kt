fun main(){
    print("Enter a number:")

    val num = readln().toInt()

    var isPrime = true

    if(num <= 1){
        isPrime = false
    }
    else{
        for(i in 2 until num){
            if(num % i ==0){
                isPrime = false
                break
            }
        }
    }
    if(isPrime){
        println("Prime number is $num")
    }
    else{
        println(" $num Not a prime number")
    }
}
