//Base class, the key word open is important for the base class 
//because all the classes in Kotlin are final (non-inheritable).
open class Pet(var name:String="none",var age:Int=0)
{
    
    //Unit equivalent to void
    open fun printPet():Unit{}
}
class Cat(name:String,age:Int):Pet(name,age)
{
    override fun printPet()
    {
        println("Cat data")
        println("pet name: ${name}")
        println("pet age: ${age}")
    }
    fun meow()
    {
        println("meow... meow...")
    }
}
class Dog(name:String,age:Int):Pet(name,age)
{
    override fun printPet()
    {
        println("Dog data")
        println("pet name: ${name}")
        println("pet age: ${age}")
    }
    fun woof()
    {
        println("woof... woof...")
    }
}

//main function
fun main(args:Array<String>)
{
    val pet1 = Dog("Firulais",6)
    val pet2 = Cat("Michi",4)
    
    println("what sound make pet 1?")
    println("pet sound is:")
    evaluatePet(pet1)
    println("what sound make pet 2?")
    println("pet sound is:")
    evaluatePet(pet2)
}
fun evaluatePet(pet:Pet)
{
    pet.printPet()
    // is <Class>:bool    ------- equivalent to instanceOf in java
    when(pet)
    {
        //The cast is maked explicity
        is Cat -> pet.meow()
        is Dog -> pet.woof()
    }
}