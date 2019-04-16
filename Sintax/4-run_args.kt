//We will verify if args are pased to the aplication
fun main (args:Array<String>)
{
    //size property return a int value with the size of array
    if(args.size > 0)
    {
        print("The argument [0] is : ${args[0]} ")
    }else
    {
        println("There are no arguments")
    }
}