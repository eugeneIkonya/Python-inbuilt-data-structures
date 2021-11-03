fun main(){
    print("Enter First Number: ")
    val num1:Int = readLine()!!.toInt()
    print("Enter Second Number: ")
    val num2:Int = readLine()!!.toInt()

    addition(num1,num2)
    subtraction(num1,num2)
    multiply(num1,num2)
    divide(num1,num2)
    remainder(num1,num2)
}

fun addition(a:Int,b:Int){
    val sum = a + b;
    println("The sum is : $sum")
}
fun subtraction(a:Int,b:Int){
    val res = a - b;
    println("The result is : $res")
}
fun multiply(a:Int,b:Int){
    val res = a * b;
    println("The product is : $res")
}
fun divide(a:Int,b:Int){
    val res = a / b;
    println("The division  is : $res")
}
fun remainder(a:Int,b:Int){
    val res = a % b;
    println("The remainder is : $res")
}