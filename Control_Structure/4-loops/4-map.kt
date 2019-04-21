fun main(args:Array<String>)
{

    
    val map = mapOf(1 to "One",2 to "Two",3 to "Three")
    println("Key -> Value")
    for((key,value) in map)
    {
        println("$key -> $value")
    }
}