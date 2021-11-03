import java.util.*

fun main(){
    var petsList = LinkedList<String>()
    populateLinkedList(petsList)
    printLinkedList(petsList)
}
fun populateLinkedList(myLinkedList: LinkedList<String>){
    do{
        print("Enter Pet Names or exit to quit :")
        val name = readLine()!!.toString()
        if (name != "exit"){
            myLinkedList.add(name)
        }
    }while (name != "exit")
}
fun printLinkedList(myLinkedList: LinkedList<String>){
    println("===== Printing Array List =====")
    for (pet in myLinkedList){
        println(pet)
    }
    print("The list has ${myLinkedList.size} items")
}