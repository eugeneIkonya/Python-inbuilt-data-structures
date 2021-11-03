fun main(){
    for(i in 1..10){
        if(i == 5){
            continue
        }
        println("Count : $i")
    }

    for (i in 1..5){
        if (i==3){
            break
        }
        println("Number is : $i")
    }
    //Breaking a nested loop

    loop@ for (i in 1..10){
        for (j in 1..3){
            if (j==3){
                break@loop
            }
            println("wassup")
        }
    }
}