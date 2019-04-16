fun main(args:Array<String>)
{
    displaySeparator()
    displaySeparator('#',5)
    displaySeparator('.',3)
    //also we can use the arguments name
    displaySeparator(size=6,character='$')
}
fun displaySeparator(character:Char ='*',size:Int=10)
{
    //repeat : this fun create a cicle of n repetition
    repeat(size)
    {
        print(character)
    }
    println("")
}