fun main(args:Array<String>)
{
    // joinToString Method
    val my_list = listOf("a","b","c")
    println(my_list.joinToString(separator="",prefix="(",postfix=")"))
}