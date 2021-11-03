fun checkEven(num:Int):Boolean{
    if(num % 2 == 0){
        return true
    }
    return false
}
fun main(){
    print("Enter a number :")
    var num = readLine()!!.toInt()
    println(checkEven(num))
}