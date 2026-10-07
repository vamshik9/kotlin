//Print prime numbers
fun main(){

    for(i in 1 .. 30){
        var isPrime = true

        if(i <= 1){
            isPrime = false
        }
        else {
            for(j in 2 until i){
                if(i % j==0){
                    isPrime = false
                }
            }
        }
        if(isPrime){
            println(i)
        }
    }
}
