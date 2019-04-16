fun main(args:Array<String>)
{
    // in mutableListOf we can reset the values in the list
    val var_list = mutableListOf("Index 0","Index 2","Index 3")
    println("Firs element in the list ${var_list[0]} ")

    //set other value en the list index 0
    var_list[0] = "Other value"
    println("The changed elment ${var_list[0]} ")
}