import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args:Array<String>){
    print("Enter 1 to read and 2 to write to file: ")
    var choice:Int = readLine()!!.toInt()

    when(choice){
        1 ->{
            println("Reading from file")
            ReadFromFile()
        }
        2 -> {
            println("Writing to file")
            print("Write text to be put into file: ")
            var str:String = readLine()!!.toString()
            WriteToFile(str)
        }
    }

}
fun WriteToFile(str:String){
    try{
        var fo = FileWriter("test.text",true)
        fo.write(str + "\n")
        fo.close()
    }catch (ex:Exception){
        print(ex.message)
    }
}
fun ReadFromFile(){
    try{
        var fin = FileReader("test.text")
        var c:Int?
        do{
            c=fin.read()
            print(c.toChar())
        }while (c != -1)
    }catch (ex:Exception){
        println(ex.message)
    }
}
