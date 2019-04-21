fun main (args:Array<String>)
{
    //we can create string range the strings are compared lexicographically
    //it is eg. car is in the range  apple .. juice, because c is in the range a - j
    println("ball in a-k")
    println("${"ball" in "a".."k"}")
    println("zoo in a-k")
    println("${"zoo" in "a".."k"}")
}