fun main(args:Array<String>)
{
    //Triple double quote is used to set a multiline string
    var s:String = """Welcome to this test program
    |it's a multiline text"""
    println(s)//This text no have margin
    //this method use String.trimMargin(marginPrefix: String = "|")
    println(s.trimMargin())//This text take margin with the prefix |

    //Another option to create a margin without prefixes is 
    var s2:String = """Welcome to this test program
    it's a multiline text""".trimIndent()
    print(s2)
}