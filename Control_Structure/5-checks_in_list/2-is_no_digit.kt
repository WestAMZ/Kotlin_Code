fun main(args:Array<String>)
{
    println("Is not a digit '8' ?")
    println("${isNoDigit('8')}")
    println("Is not a digit 'Z' ?")
    isNoDigit('Z')
    println("${isNoDigit('Z')}")
}
//we can negate the 'in' sentece
fun isNoDigit(c:Char) = c !in '0'..'9'