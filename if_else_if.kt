fun main(){

    print("Enter age:")
    val age = readln().toInt()

    if(age > 18){
        println("Adult")
    }

    if(age > 18){
        println("Adult ")
    }
    else{
        println("Teenage")
    }

    if(age > 18){
        println("Adult ")
    }
    else if(age > 10 && age < 18){
        println("Teenage")
    }
    else {
        println("Child")
    }

}
