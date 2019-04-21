fun main(args:Array<String>)
{
    println("Have you been read the terms and conditions and agree it? (y/n)")
    val input:String = readLine()!!
    println("${evalueInput(input)}")
}
fun evalueInput(input:String):String= when(input){
    
        "y","yes"-> "i am glad you agree"
        "n","no"-> "Sorry to heart that"
        else -> "I don't understand you" 
    }
