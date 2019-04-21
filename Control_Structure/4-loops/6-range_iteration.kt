fun main(args:Array<String>)
{
    //.. is a operator for creates a range
    println("printing numbers from 1 to 15 with .. (range) operator")
    for(n in 1..15)
    {
        println(n)
    }
    println("printing numbers from 1 to 15 with until (the last element is omited)")
    for(n in 1 until 15)
    {
        println(n)
    }
}