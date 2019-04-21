fun main(args:Array<String>)
{
    //This code check if a character is a letter
    
    println("Is letter '%' ?")
    println("${isLetter('%')}")

    println("Is letter 'x'?")
    println("${isLetter('x')}")
}
//This body expression function. check if c is between a-z and A-Z interval
fun isLetter(c:Char)= c in 'a'..'z' || 'c' in 'A'..'Z'
//c in 'a'..'z'  is equivalent to   c >='a' && c <='z'