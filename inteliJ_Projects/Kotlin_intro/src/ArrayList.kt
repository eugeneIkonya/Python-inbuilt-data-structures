fun main(){
    var petsList = ArrayList<String>()
    populateArrayList(petsList)
    printArrayList(petsList)
}
fun populateArrayList(myArrayList:ArrayList<String>){
    do{
        print("Enter Pet Names or exit to quit :")
        val name = readLine()!!.toString()
        if (name != "exit"){
            myArrayList.add(name)
        }
    }while (name != "exit")
}
fun printArrayList(myArrayList:ArrayList<String>){
    println("===== Printing Array List =====")
    for (pet in myArrayList){
        println(pet)
    }
    print("The list has ${myArrayList.size} items")
}