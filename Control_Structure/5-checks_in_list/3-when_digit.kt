fun main(args:Array<String>)
{
    println("What is 5?")
    println("${recognize('5')}")
    println("What is *?")
    println("${recognize('*')}")
    println("What is A?")
    println("${recognize('A')}")
}
fun recognize(c:Char):String =
when(c)
{
    // we use ',' to enumerate the two case in that is a letter instead of '||'
    in '0'..'9'->"It's a digit!"
    in 'a'..'z' , in 'A'..'Z'->"It's a letter!"
    else "I don't know!"
}
