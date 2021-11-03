fun main(){
    var name = "Eugene Ikonya"
    var message = " The sexiest man alive!! "

    var fullMessage = "$name,$message"

    println(fullMessage)

    //Arrays working as arrays
    println(name[0])
    println(fullMessage[0])
    //lowercase
    println(fullMessage.toLowerCase())
    //uppercase
    println(fullMessage.toUpperCase())
    //remove spaces before and after the string
    println(message.trim())
    println(message)

    val tokens = message.split(" ")

    for (token in tokens){
        println(token)
    }
    for (token in tokens){
        if(!token.contains("sexiest") && !token.contains("alive!!")){
            println(token)
        }
    }
}