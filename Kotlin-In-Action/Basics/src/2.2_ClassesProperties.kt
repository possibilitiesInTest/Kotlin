// class Person(val name: String)
// converted from Java class
// value object
// public is the default visibility

class Person(
    val name: String,        // read-only
    var isMarried: Boolean   // mutable
) {
    fun getName(): Any? {
        return name
    }

    fun isMarried(): Any? {
        return isMarried
    }
}


//println(person.getName())
// Bob
//println(person.isMarried())
// true

fun main(args: Array<String>){
    val person = Person(
        "Bob",
        true
    )
    println(person.getName())
    println(person.isMarried())
}