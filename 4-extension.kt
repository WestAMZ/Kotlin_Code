fun main(args:Array<String>)
{
    println(15 eq 16)
    println(3  eq 3)
}
infix fun <T> T.eq(other:T):String
{
    if(this == other)return("OK")
    else return "ERROR: $this != $other"
}