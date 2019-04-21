package mypackage
import mypackage.Color.*

fun main(args:Array<String>)
{
    println("${mix(RED,YELLOW)}")
    println("${mix(RED,BLUE)}")
    println("${mix(YELLOW,BLUE)}")
}
//setOf set a group of elements in the same object
fun mix(c1:Color,c2:Color)= when(setOf(c1,c2))
{
    setOf(RED,YELLOW)->ORANGE
    setOf(YELLOW,BLUE)->GREEN
    setOf(RED,YELLOW)->INDIGO
    //Else we trow a exception
    else ->throw Exception("Dirty color") 
}
