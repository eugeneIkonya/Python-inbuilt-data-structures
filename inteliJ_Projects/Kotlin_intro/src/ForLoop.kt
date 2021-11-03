fun main(){
    normalLoop()
//    oddNumbersIncrement()
//    evenNumbersIncrement()
//    oddNumbersDecrement()
//    evenNumbersDecrement()
}
fun normalLoop(){
    for(i in 1..10){
        println("The loop is at $i")
    }
}
fun oddNumbersIncrement() {
    for(i in 1..100 step 2){
        println("Odd Number : $i")
    }
}
fun oddNumbersDecrement(){
    for (i in 99 downTo 0 step 2){
        println("Odd Number : $i")
    }
}
fun evenNumbersIncrement(){
    for (i in 0..100 step 2){
        println("Even Number : $i")
    }
}
fun evenNumbersDecrement(){
    for (i in 100 downTo 0 step 2){
        println("Even Number : $i")
    }
}