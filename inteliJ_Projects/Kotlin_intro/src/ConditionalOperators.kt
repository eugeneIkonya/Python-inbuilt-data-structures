fun main(){
    val num =101

    if(num >=1 && num <= 10){
        println("The number is within the range of one and 10")
    }else{
        println("it is not ")
    }
    print("Enter the food id: ")
    val foodId:Int = readLine()!!.toInt()

    when(foodId){
        1 -> {
            println("The order is a burger")
        }
        2 -> {
            println("The order is a Pizza")
        }
        3 -> {
            println("The order is ugali")
        }
        else -> {
            println("The order is not available")
        }

    }
}