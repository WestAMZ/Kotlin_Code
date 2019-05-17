import java.util.regex.Pattern
fun main(args:Array<String>)
{
    //we use triple quote to not to have double \ 
    val regex = """\d{2}\.\d{2}\.\d{4}""".toRegex()
    println("${regex.matches("02.06.2015")}")//True
    println("${regex.matches("02.06.15")}")//False    
}