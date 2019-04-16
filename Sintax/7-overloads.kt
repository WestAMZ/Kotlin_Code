fun main(args:Array<String>)
{
    greetin("Alex")
    greetin("Jade","good nigth")
}
@JvmOverloads fun greetin(name:String="you",greetinText:String="Nice to meet you")
{
    println("Hey $name, greetingText")
}
@JvmOverloads fun greetin(name:String="you",)
{
    println("Hey $name, Hi!)
}