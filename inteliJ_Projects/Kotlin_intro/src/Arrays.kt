fun main(){
    val maxLength = 3
    var petsArray:Array<String> = Array(maxLength){""}

    populateArray(petsArray,maxLength)
    printArray(petsArray,maxLength)
}
fun populateArray(myArray:Array<String>,len:Int){
    for (i in 0 until len){
        print("Enter Pet $i: ")
        myArray[i] = readLine()!!.toString()
    }
}
fun printArray(myArray:Array<String>,len:Int){
    println("====Printing Array=====")
    for (i in 0 until len){
        println("Pet $i is ${myArray[i]}")
    }
}