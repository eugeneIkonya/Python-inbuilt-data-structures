import java.lang.Exception

fun main(){
    try{
        print("Enter the number to divide with: ")
        var num:Int = readLine()!!.toInt()
        var div = 100/num
        println("Div : $div")
    }catch (ex:Exception){
        print(ex.message)
    }
}