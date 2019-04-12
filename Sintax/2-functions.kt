fun main(args:Array<String>)
{
    printMenu()
    val answer:String = readLine()!!
    when (answer)
    {
        "y" -> println("It's nice")
        "n" -> println("Don't worry, be happy :D")
        else ->println("You don't have been anwer my question :c") 
    }
    
    
}
//Function estructure 
// key word  fun <function_name> (arg_name:arg_type ....)
fun printMenu()
{
    println("Welcome to my program")
    println("Are you happy?")
    println("Yes (y)")
    println("No (n)")
}