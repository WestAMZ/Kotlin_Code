enum class Color
{
    BLUE,ORANGE,RED
}
fun main(args:Array<String>)
{
    println("A description for BLUE ${getDescription(Color.BLUE)}")
}
//fun  (body expression) that returns a description for each color
fun getDescription(color:Color):String=
    when(color)
    {
        Color.BLUE-> "cold"
        Color.ORANGE ->"mild"
        Color.RED -> "hot" 
    }
