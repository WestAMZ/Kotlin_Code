fun main(args:Array<String>)
{
    println("The max number between 5 and 10 is : ${max(5,10)}")

}
//function in body expression
fun max(a:Int,b:Int) = if (a > b) a else b
/* 
    body expression equivalent to 

    fun max(a:Int,b:Int):Int
    {
        return if (a > b) a else b 
    }
*/
