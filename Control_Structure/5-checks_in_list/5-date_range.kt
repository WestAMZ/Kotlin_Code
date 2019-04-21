import java.time.LocalDate
fun main (args:Array<String>)
{
    //the range of date are defined in the same way
    var year = 2019
    var month = 1
    var day = 1

    //we use a class from java
    val startDate = LocalDate.of(year,month,day) 
    println(startDate)
}