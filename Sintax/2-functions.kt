fun main(args:Array<String>)
{
    println("This is the calling first time ${foo()} and  second time ${foo()}")
}
fun foo():String
{   
    println("runing  function..")
    return "foo()"
}