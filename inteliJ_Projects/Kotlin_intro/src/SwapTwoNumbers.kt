fun swapTwoNumbers(numbers:Array<Int>):Array<Int>{
    var temp = numbers[1]
    numbers[1] = numbers[0]
    numbers[0] = temp
    return numbers
}

fun main(){
    var x =10;
    var y = 20;

    x = y.also { y=x }

//    var nums:Array<Int> = Array(2){0}
//    nums[0]=x
//    nums[1]=y
//
//    swapTwoNumbers(nums)
//    x = nums[0]
//    y = nums[1]

    println("The value of x is $x and the value of y is $y")
}