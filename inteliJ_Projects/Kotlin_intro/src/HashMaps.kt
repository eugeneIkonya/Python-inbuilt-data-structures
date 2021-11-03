fun main(){
    var listOfUsers = HashMap<Int,String>()
    populateHashMap(listOfUsers)
    printHashMap(listOfUsers)
}
fun populateHashMap(myHashMap: HashMap<Int,String>){
    do{
        print("Enter User ID :")
        val id = readLine()!!.toInt()
        print("Enter User Name : ")
        var name = readLine()!!.toString()

        if(name != "exit"){
            myHashMap[id] = name
        }
    }while (name != "exit")
}
fun printHashMap(myHashMap: HashMap<Int,String>){
    for (key in myHashMap.keys){
        println("User $key is ${myHashMap[key]} ")
    }
}