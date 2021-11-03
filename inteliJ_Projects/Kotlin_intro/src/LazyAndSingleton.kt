class myObject{
    var name:String ?= null

    private constructor(){
        println("Instance is created")
    }
    companion object{
        val instance:myObject by lazy { myObject() }
    }

}
fun main(args:Array<String>){
    var obj1 = myObject.instance
    obj1.name = "Eugene"
    println(obj1.name)

    var obj2 = myObject.instance
//    obj2.name = "ikon"
    println(obj2.name)
}