fun main(args:Array<String>)
{

    val list = listOf("a","b","c")
    println("Index -> Value")
    for((index,value) in list.withIndex())
    {
        println("$index -> $value")
    }
}