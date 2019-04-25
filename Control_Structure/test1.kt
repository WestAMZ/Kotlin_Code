//Implement the function that checks whether a string is a valid identifier. 
//A valid identifier is a non-empty string that starts with a letter or underscore 
//and consists of only letters, digits and underscores.

fun isValidIdentifier(s: String): Boolean {
   	var bool = true
    if( s.length == 0)
    {
        return false
    }
    for((index,c) in s.withIndex())
    {
        if(index==0)
        {
            bool = bool && (c == '_' || c in 'A'..'Z' || c in 'a'..'z')
        }else
        {
            bool = bool && (c == '_' || c in 'A'..'Z' || c in 'a'..'z' || c in '0'..'9')
        }
    }
    return bool
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}