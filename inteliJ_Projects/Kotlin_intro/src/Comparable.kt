import java.util.*
import kotlin.collections.ArrayList


fun main(args:Array<String>){
    var listOfNames = ArrayList<String>()
    listOfNames.add("Eugene")
    listOfNames.add("Tiffany")
    listOfNames.add("Kung'u")
    listOfNames.add("Chelagat")

//    var listOfPeople = ArrayList<Person>()
//    listOfPeople.add(Person("Eugene",20))
//    listOfPeople.add(Person("Tiffany",23))
//    listOfPeople.add(Person("Chelagat",24))
//    listOfPeople.add(Person("kung'u",21))


    println("====Before Sorting====")
    //printing list of names
    for (name in listOfNames){
        println(name)
    }
    Collections.sort(listOfNames)
    println("++++After Sorting+++")
    for (name in listOfNames){
        println(name)
    }


    //comparing for classes
}