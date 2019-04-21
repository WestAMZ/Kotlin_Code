fun main(args:Array<String>)
{
    val list = listOf("a","b","c","d","e","f","g")
    println("ordered list:")
    //you can specify the variable type
    for(s:String in list)
    {
        print(s)
    }
    println("inverse list:")
    //if you not especify the var tipe, is done by kotlin
    for(s in list.asReversed())
    {
        print(s)
    }

}